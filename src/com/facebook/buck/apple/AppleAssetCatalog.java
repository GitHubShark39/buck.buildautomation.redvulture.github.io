/*
 * Copyright 2014-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.apple;

import com.facebook.buck.io.BuildCellRelativePath;
import com.facebook.buck.io.ProjectFilesystem;
import com.facebook.buck.model.BuildTarget;
import com.facebook.buck.model.BuildTargets;
import com.facebook.buck.model.Flavor;
import com.facebook.buck.model.InternalFlavor;
import com.facebook.buck.rules.AbstractBuildRuleWithDeclaredAndExtraDeps;
import com.facebook.buck.rules.AddToRuleKey;
import com.facebook.buck.rules.BuildContext;
import com.facebook.buck.rules.BuildRuleParams;
import com.facebook.buck.rules.BuildableContext;
import com.facebook.buck.rules.SourcePath;
import com.facebook.buck.rules.SourcePathResolver;
import com.facebook.buck.rules.Tool;
import com.facebook.buck.step.Step;
import com.facebook.buck.step.fs.MakeCleanDirectoryStep;
import com.facebook.buck.step.fs.MkdirStep;
import com.facebook.buck.util.HumanReadableException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedSet;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class AppleAssetCatalog extends AbstractBuildRuleWithDeclaredAndExtraDeps {

  public static final Flavor FLAVOR = InternalFlavor.of("apple-asset-catalog");

  private static final String BUNDLE_DIRECTORY_EXTENSION = ".bundle";

  @AddToRuleKey private final String applePlatformName;

  @AddToRuleKey private final String targetSDKVersion;

  @AddToRuleKey private final Tool actool;

  @AddToRuleKey private final ImmutableSortedSet<SourcePath> assetCatalogDirs;

  @AddToRuleKey(stringify = true)
  private final Path outputDir;

  private final Path outputPlist;

  @AddToRuleKey private final Optional<String> appIcon;

  @AddToRuleKey private final Optional<String> launchImage;

  @AddToRuleKey private final AppleAssetCatalogDescription.Optimization optimization;

  AppleAssetCatalog(
      BuildTarget buildTarget,
      ProjectFilesystem projectFilesystem,
      BuildRuleParams params,
      String applePlatformName,
      String targetSDKVersion,
      Tool actool,
      ImmutableSortedSet<SourcePath> assetCatalogDirs,
      Optional<String> appIcon,
      Optional<String> launchImage,
      AppleAssetCatalogDescription.Optimization optimization,
      String bundleName) {
    super(buildTarget, projectFilesystem, params);
    this.applePlatformName = applePlatformName;
    this.targetSDKVersion = targetSDKVersion;
    this.actool = actool;
    this.assetCatalogDirs = assetCatalogDirs;
    this.outputDir =
        BuildTargets.getGenPath(getProjectFilesystem(), buildTarget, "%s")
            .resolve(bundleName + BUNDLE_DIRECTORY_EXTENSION);
    this.outputPlist =
        BuildTargets.getScratchPath(getProjectFilesystem(), buildTarget, "%s-output.plist");
    this.appIcon = appIcon;
    this.launchImage = launchImage;
    this.optimization = optimization;
  }

  @Override
  public ImmutableList<Step> getBuildSteps(
      BuildContext context, BuildableContext buildableContext) {
    ImmutableList.Builder<Step> stepsBuilder = ImmutableList.builder();

    stepsBuilder.addAll(
        MakeCleanDirectoryStep.of(
            BuildCellRelativePath.fromCellRelativePath(
                context.getBuildCellRootPath(), getProjectFilesystem(), outputDir)));
    stepsBuilder.add(
        MkdirStep.of(
            BuildCellRelativePath.fromCellRelativePath(
                context.getBuildCellRootPath(), getProjectFilesystem(), outputPlist.getParent())));
    ImmutableSortedSet<Path> absoluteAssetCatalogDirs =
        context.getSourcePathResolver().getAllAbsolutePaths(assetCatalogDirs);
    stepsBuilder.add(
        new ActoolStep(
            getProjectFilesystem().getRootPath(),
            applePlatformName,
            targetSDKVersion,
            actool.getEnvironment(context.getSourcePathResolver()),
            actool.getCommandPrefix(context.getSourcePathResolver()),
            absoluteAssetCatalogDirs,
            getProjectFilesystem().resolve(outputDir),
            getProjectFilesystem().resolve(outputPlist),
            appIcon,
            launchImage,
            optimization));

    buildableContext.recordArtifact(getOutputDir());
    buildableContext.recordArtifact(outputPlist);
    return stepsBuilder.build();
  }

  @Nullable
  @Override
  public SourcePath getSourcePathToOutput() {
    return null;
  }

  public Path getOutputDir() {
    return outputDir;
  }

  public Path getOutputPlist() {
    return outputPlist;
  }

  public static void validateAssetCatalogs(
      ImmutableSortedSet<SourcePath> assetCatalogDirs,
      BuildTarget buildTarget,
      ProjectFilesystem projectFilesystem,
      SourcePathResolver sourcePathResolver,
      ValidationType validationType)
      throws HumanReadableException {
    HashMap<String, Path> catalogPathsForImageNames = new HashMap<>();
    ArrayList<String> errors = new ArrayList<>();

    for (SourcePath assetCatalogDir : assetCatalogDirs) {
      Path catalogPath = sourcePathResolver.getRelativePath(assetCatalogDir);
      if (!catalogPath.getFileName().toString().endsWith(".xcassets")) {
        errors.add(
            String.format(
                "Target %s had asset catalog dir %s - asset catalog dirs must end with .xcassets",
                buildTarget, catalogPath));
        continue;
      }

      switch (validationType) {
        case XCODE:
          continue;
        case STRICT:
          strictlyValidateAssetCatalog(
              catalogPath, catalogPathsForImageNames, errors, projectFilesystem);
      }
    }

    if (!errors.isEmpty()) {
      throw new HumanReadableException(
          String.format("Asset catalogs invalid\n%s", String.join("\n", errors)));
    }
  }

  /*
   * Perform strict validation, guarding against missing Contents.json and duplicate image names.
   */
  private static void strictlyValidateAssetCatalog(
      Path catalogPath,
      Map<String, Path> catalogPathsForImageNames,
      List<String> errors,
      ProjectFilesystem projectFilesystem)
      throws HumanReadableException {
    try {
      boolean mainContentsJsonPresent = false;
      for (Path asset : projectFilesystem.getDirectoryContents(catalogPath)) {
        if (asset.getFileName().toString().equals("Contents.json")) {
          mainContentsJsonPresent = true;
          continue;
        }

        boolean contentsJsonPresent = false;
        for (Path assetContentPath : projectFilesystem.getDirectoryContents(asset)) {
          String filename = assetContentPath.getFileName().toString();
          if (filename.equals("Contents.json")) {
            contentsJsonPresent = true;
            continue;
          }

          // Lowercase asset name in case we're building on a case sensitive file system.
          String filenameKey = filename.toLowerCase();
          if (!asset.toString().endsWith(".imageset")) {
            continue;
          } else if (catalogPathsForImageNames.containsKey(filenameKey)) {
            Path existingCatalogPath = catalogPathsForImageNames.get(filenameKey);
            if (catalogPath.equals(existingCatalogPath)) {
              continue;
            } else {
              // All asset catalogs (.xcassets directories) get merged into a single directory per apple bundle.
              // Imagesets containing images with identical names can overwrite one another, this is especially
              // problematic if two images share a name but are different
              errors.add(
                  String.format(
                      "%s is included by two asset catalogs: '%s' and '%s'",
                      assetContentPath.getFileName(), catalogPath, existingCatalogPath));
            }
          } else {
            catalogPathsForImageNames.put(filenameKey, catalogPath);
          }
        }

        if (!contentsJsonPresent) {
          errors.add(String.format("%s doesn't have Contents.json", asset));
        }
      }

      if (!mainContentsJsonPresent) {
        errors.add(String.format("%s doesn't have Contents.json", catalogPath));
      }
    } catch (IOException e) {
      throw new HumanReadableException(
          "Failed to process asset catalog at %s: %s", catalogPath, e.getMessage());
    }
  }

  public enum ValidationType {
    // Roughly match what Xcode is doing, only check whether the directory ends in .xcassets
    XCODE,
    // Guard against duplicate image names and missing Contents.json files
    STRICT
  }
}
