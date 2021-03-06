/*
 * Copyright 2015-present Facebook, Inc.
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

package com.facebook.buck.jvm.scala;

import com.facebook.buck.io.PathOrGlobMatcher;
import com.facebook.buck.io.ProjectFilesystem;
import com.facebook.buck.jvm.java.CompileToJarStepFactory;
import com.facebook.buck.jvm.java.CompilerParameters;
import com.facebook.buck.jvm.java.ExtraClasspathFromContextFunction;
import com.facebook.buck.jvm.java.Javac;
import com.facebook.buck.jvm.java.JavacOptions;
import com.facebook.buck.jvm.java.JavacToJarStepFactory;
import com.facebook.buck.model.BuildTarget;
import com.facebook.buck.rules.AddToRuleKey;
import com.facebook.buck.rules.AddsToRuleKey;
import com.facebook.buck.rules.BuildContext;
import com.facebook.buck.rules.BuildRule;
import com.facebook.buck.rules.BuildableContext;
import com.facebook.buck.rules.SourcePath;
import com.facebook.buck.rules.SourcePathResolver;
import com.facebook.buck.rules.SourcePathRuleFinder;
import com.facebook.buck.rules.Tool;
import com.facebook.buck.step.Step;
import com.facebook.buck.util.MoreCollectors;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Iterables;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Collectors;

public class ScalacToJarStepFactory extends CompileToJarStepFactory implements AddsToRuleKey {

  private static final PathOrGlobMatcher JAVA_PATH_MATCHER = new PathOrGlobMatcher("**.java");
  private static final PathOrGlobMatcher SCALA_PATH_MATCHER = new PathOrGlobMatcher("**.scala");

  @AddToRuleKey private final Tool scalac;
  private final BuildRule scalaLibraryTarget;
  @AddToRuleKey private final ImmutableList<String> configCompilerFlags;
  @AddToRuleKey private final ImmutableList<String> extraArguments;
  @AddToRuleKey private final ImmutableSet<SourcePath> compilerPlugins;
  @AddToRuleKey private final ExtraClasspathFromContextFunction extraClassPath;
  private final Javac javac;
  private final JavacOptions javacOptions;

  public ScalacToJarStepFactory(
      Tool scalac,
      BuildRule scalaLibraryTarget,
      ImmutableList<String> configCompilerFlags,
      ImmutableList<String> extraArguments,
      ImmutableSet<BuildRule> compilerPlugins,
      Javac javac,
      JavacOptions javacOptions) {
    this(
        scalac,
        scalaLibraryTarget,
        configCompilerFlags,
        extraArguments,
        compilerPlugins,
        javac,
        javacOptions,
        ExtraClasspathFromContextFunction.EMPTY);
  }

  public ScalacToJarStepFactory(
      Tool scalac,
      BuildRule scalaLibraryTarget,
      ImmutableList<String> configCompilerFlags,
      ImmutableList<String> extraArguments,
      ImmutableSet<BuildRule> compilerPlugins,
      Javac javac,
      JavacOptions javacOptions,
      ExtraClasspathFromContextFunction extraClassPath) {
    this.scalac = scalac;
    this.scalaLibraryTarget = scalaLibraryTarget;
    this.configCompilerFlags = configCompilerFlags;
    this.extraArguments = extraArguments;
    this.compilerPlugins =
        compilerPlugins
            .stream()
            .map(BuildRule::getSourcePathToOutput)
            .collect(MoreCollectors.toImmutableSet());
    this.javac = javac;
    this.javacOptions = javacOptions;
    this.extraClassPath = extraClassPath;
  }

  @Override
  public void createCompileStep(
      BuildContext context,
      BuildTarget invokingRule,
      SourcePathResolver resolver,
      ProjectFilesystem filesystem,
      CompilerParameters parameters,
      /* output params */
      ImmutableList.Builder<Step> steps,
      BuildableContext buildableContext) {

    ImmutableSortedSet<Path> classpathEntries = parameters.getClasspathEntries();
    ImmutableSortedSet<Path> sourceFilePaths = parameters.getSourceFilePaths();
    Path outputDirectory = parameters.getOutputDirectory();

    if (sourceFilePaths.stream().anyMatch(SCALA_PATH_MATCHER::matches)) {
      steps.add(
          new ScalacStep(
              scalac,
              ImmutableList.<String>builder()
                  .addAll(configCompilerFlags)
                  .addAll(extraArguments)
                  .addAll(
                      Iterables.transform(
                          compilerPlugins,
                          input ->
                              "-Xplugin:"
                                  + context
                                      .getSourcePathResolver()
                                      .getRelativePath(input)
                                      .toString()))
                  .build(),
              resolver,
              outputDirectory,
              sourceFilePaths,
              ImmutableSortedSet.<Path>naturalOrder()
                  .addAll(
                      Optional.ofNullable(extraClassPath.apply(context)).orElse(ImmutableList.of()))
                  .addAll(classpathEntries)
                  .build(),
              filesystem));
    }

    ImmutableSortedSet<Path> javaSourceFiles =
        ImmutableSortedSet.copyOf(
            sourceFilePaths
                .stream()
                .filter(JAVA_PATH_MATCHER::matches)
                .collect(Collectors.toSet()));

    // Don't invoke javac if we don't have any java files.
    if (!javaSourceFiles.isEmpty()) {
      CompilerParameters javacParameters =
          CompilerParameters.builder()
              .from(parameters)
              .setClasspathEntries(
                  ImmutableSortedSet.<Path>naturalOrder()
                      .add(outputDirectory)
                      .addAll(
                          Optional.ofNullable(extraClassPath.apply(context))
                              .orElse(ImmutableList.of()))
                      .addAll(classpathEntries)
                      .build())
              .setSourceFilePaths(javaSourceFiles)
              .build();
      new JavacToJarStepFactory(javac, javacOptions, extraClassPath)
          .createCompileStep(
              context,
              invokingRule,
              resolver,
              filesystem,
              javacParameters,
              steps,
              buildableContext);
    }
  }

  @Override
  public Tool getCompiler() {
    return scalac;
  }

  @Override
  public Iterable<BuildRule> getDeclaredDeps(SourcePathRuleFinder ruleFinder) {
    return Iterables.concat(
        super.getDeclaredDeps(ruleFinder), ImmutableList.of(scalaLibraryTarget));
  }
}
