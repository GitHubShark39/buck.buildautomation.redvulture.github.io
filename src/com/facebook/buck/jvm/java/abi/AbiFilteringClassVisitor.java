/*
 * Copyright 2017-present Facebook, Inc.
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

package com.facebook.buck.jvm.java.abi;

import com.google.common.base.Preconditions;
import java.util.Set;
import javax.annotation.Nullable;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/** A {@link ClassVisitor} that only passes to its delegate events for the class's ABI. */
class AbiFilteringClassVisitor extends ClassVisitor {
  @Nullable private final Set<String> referencedClassNames;

  @Nullable private String name;
  @Nullable private String outerName = null;
  private int classAccess;
  private boolean hasVisibleConstructor = false;

  public AbiFilteringClassVisitor(ClassVisitor cv) {
    this(cv, null);
  }

  public AbiFilteringClassVisitor(ClassVisitor cv, @Nullable Set<String> referencedClassNames) {
    super(Opcodes.ASM5, cv);
    this.referencedClassNames = referencedClassNames;
  }

  @Override
  public void visit(
      int version,
      int access,
      String name,
      String signature,
      String superName,
      String[] interfaces) {
    this.name = name;
    classAccess = access;
    super.visit(version, access, name, signature, superName, interfaces);
  }

  @Override
  public void visitInnerClass(String name, String outerName, String innerName, int access) {
    if (name.equals(this.name)) {
      this.outerName = outerName;
    }

    if (!shouldIncludeInnerClass(access, name, outerName)) {
      return;
    }

    super.visitInnerClass(name, outerName, innerName, access);
  }

  @Override
  @Nullable
  public FieldVisitor visitField(
      int access, String name, String desc, String signature, Object value) {
    if (!shouldInclude(access)) {
      return null;
    }
    return super.visitField(access, name, desc, signature, value);
  }

  @Override
  @Nullable
  public MethodVisitor visitMethod(
      int access, String name, String desc, String signature, String[] exceptions) {
    // Per JVMS8 2.9, "Class and interface initialization methods are invoked
    // implicitly by the Java Virtual Machine; they are never invoked directly from any
    // Java Virtual Machine instruction, but are invoked only indirectly as part of the class
    // initialization process." Thus we don't need to emit a stub of <clinit>.
    if (!shouldInclude(access) || (name.equals("<clinit>") && (access & Opcodes.ACC_STATIC) > 0)) {
      return null;
    }

    // We don't stub private constructors, but if stripping these constructors results in no
    // constructors at all, we want to include a default private constructor. This is because
    // removing all these private methods will make the class look like it has no constructors at
    // all, which is not possible. We track if this class has a public, non-synthetic constructor
    // and is not an interface or annotation to determine if a default private constructor is
    // generated when visitEnd() is called.
    if (name.equals("<init>") && (access & Opcodes.ACC_SYNTHETIC) == 0) {
      hasVisibleConstructor = true;
    }

    // Bridge methods are created by the compiler, and don't appear in source. It would be nice to
    // skip them, but they're used by the compiler to cover the fact that type erasure has occurred.
    // Normally the compiler adds these as public methods, but if you're compiling against a stub
    // produced using our ABI generator, we don't want people calling it accidentally. Oh well, I
    // guess it happens IRL too.
    //
    // Synthetic methods are also generated by the compiler, unless it's one of the methods named in
    // section 4.7.8 of the JVM spec, which are "<init>" and "Enum.valueOf()" and "Enum.values".
    // None of these are actually harmful to the ABI, so we allow synthetic methods through.
    // http://docs.oracle.com/javase/specs/jvms/se7/html/jvms-4.html#jvms-4.7.8
    return super.visitMethod(access, name, desc, signature, exceptions);
  }

  @Override
  public void visitEnd() {
    if (!hasVisibleConstructor && !isInterface(classAccess) && !isAnnotation(classAccess)) {
      String desc;
      if (isEnum(classAccess)) {
        desc =
            Type.getMethodType(
                    Type.VOID_TYPE, Type.getObjectType("java/lang/String"), Type.INT_TYPE)
                .getDescriptor();
      } else {
        desc =
            outerName == null
                ? Type.getMethodType(Type.VOID_TYPE).getDescriptor()
                : Type.getMethodType(Type.VOID_TYPE, Type.getObjectType(outerName)).getDescriptor();
      }
      super.visitMethod(Opcodes.ACC_PRIVATE, "<init>", desc, null, null);
    }
    super.visitEnd();
  }

  private boolean shouldIncludeInnerClass(int access, String name, @Nullable String outerName) {
    if (referencedClassNames == null || referencedClassNames.contains(name)) {
      // Either it's the first pass, and we're not filtering inner classes yet,
      // or it's the second one, and this inner class is part of the ABI and should
      // therefore be included
      return true;
    }

    String currentClassName = Preconditions.checkNotNull(this.name);
    if (name.equals(currentClassName)) {
      // Must always include the entry for our own class, since that's what makes it an inner class.
      return true;
    }

    boolean isAnonymousOrLocalClass = (outerName == null);
    if (isAnonymousOrLocalClass) {
      // Anonymous and local classes are never part of the ABI.
      return false;
    }

    if ((access & (Opcodes.ACC_SYNTHETIC | Opcodes.ACC_BRIDGE)) == Opcodes.ACC_SYNTHETIC) {
      // Don't include synthetic classes
      return false;
    }

    if (currentClassName.equals(outerName)) {
      // For now, always include our own inner classes, regardless of visibility
      return true;
    }

    return false;
  }

  private boolean shouldInclude(int access) {
    if ((access & Opcodes.ACC_PRIVATE) == Opcodes.ACC_PRIVATE) {
      return false;
    }

    if ((access & (Opcodes.ACC_SYNTHETIC | Opcodes.ACC_BRIDGE)) == Opcodes.ACC_SYNTHETIC) {
      return false;
    }

    return true;
  }

  private boolean isInterface(int access) {
    return (access & Opcodes.ACC_INTERFACE) > 0;
  }

  private boolean isAnnotation(int access) {
    return (access & Opcodes.ACC_ANNOTATION) > 0;
  }

  private boolean isEnum(int access) {
    return (access & Opcodes.ACC_ENUM) > 0;
  }
}