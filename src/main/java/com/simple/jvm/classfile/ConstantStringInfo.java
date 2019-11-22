package com.simple.jvm.classfile;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * CONSTANT_String_info结构用于表示String类型的常量对象
 *
 * CONSTANT_String_info {
 *     u1 tag;
 *     u2 string_index;
 * }
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ConstantStringInfo extends ConstantInfo {
    /**
     * string_index项的值必须是对常量池表的有效索引，常量池表在该索引处的成员必须是CONSTANT_Utf8_info结构，
     * 此结构表示Unicode码点序列，这个序列最终会被初始化为一个String对象
     */
    private short stringIndex;
}
