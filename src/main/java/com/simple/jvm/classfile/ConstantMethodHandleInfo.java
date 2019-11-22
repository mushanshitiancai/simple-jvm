package com.simple.jvm.classfile;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * CONSTANT_MethodHandle_info结构用于表示方法句柄
 *
 * CONSTANT_MethodHandle_info {
 *     u1 tag;
 *     u1 reference_kind;
 *     u2 reference_index;
 * }
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ConstantMethodHandleInfo extends ConstantInfo {
    /**
     * reference_kind 项的值必须在 1 至 9 之间（包括 1 和 9），它决定了方法句柄的类型。
     * 方法句柄类型的值表示方法句柄的字节码行为。
     */
    private byte referenceKind;
    /**
     * reference_index 项的值必须是对常量池的有效索引
     */
    private short referenceIndex;
}
