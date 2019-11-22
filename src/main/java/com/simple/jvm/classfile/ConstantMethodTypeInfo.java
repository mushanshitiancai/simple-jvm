package com.simple.jvm.classfile;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * CONSTANT_MethodType_info结构表示方法类型
 *
 * CONSTANT_MethodType_info {
 *     u1 tag;
 *     u2 descriptor_index;
 * }
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ConstantMethodTypeInfo extends ConstantInfo {
    /**
     * descriptor_index项的值必须是对常量池表的有效索引，
     * 常量池表在该索引处的成员必须是CONSTANT_Utf8_info结构，这个结构表示一个有效方法描述符。
     */
    private short descriptorIndex;
}
