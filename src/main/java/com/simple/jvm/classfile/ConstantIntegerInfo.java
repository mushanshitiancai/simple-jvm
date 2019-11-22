package com.simple.jvm.classfile;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * CONSTANT_Integer_info表示4字节的int数值常量
 *
 * CONSTANT_Integer_info {
 *     u1 tag;
 *     u4 bytes;
 * }
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ConstantIntegerInfo extends ConstantInfo {
    private int value;
}
