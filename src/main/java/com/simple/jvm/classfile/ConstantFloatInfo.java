package com.simple.jvm.classfile;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * CONSTANT_Float_info 表示4字节float的数值常量
 *
 * CONSTANT_Float_info {
 *     u1 tag;
 *     u4 bytes;
 * }
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ConstantFloatInfo extends ConstantInfo {
    private float value;
}
