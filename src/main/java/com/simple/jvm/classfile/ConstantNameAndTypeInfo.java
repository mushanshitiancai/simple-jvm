package com.simple.jvm.classfile;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * CONSTANT_NameAndType_info结构用于表示字段或方法，但是和之前的3个结构不同，
 * CONSTANT_NameAndType_info结构没有指明该字段或方法所属的类或接口
 *
 * CONSTANT_NameAndType_info {
 *     u1 tag;
 *     u2 name_index;
 *     u2 descriptor_index;
 * }
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ConstantNameAndTypeInfo extends ConstantInfo {
    /**
     * name_index项的值必须是对常量池的有效索引，常量池在该索引处的项必须是CONSTANT_Utf8_info结构，
     * 这个结构要么表示特殊的方法名<init>，要么表示一个有效的字段或方法的非限定名(Unqualified Name)
     */
    private short nameIndex;
    /**
     * descriptor_index项的值必须是对常量池的有效索引，常量池在该索引处的项必须是CONSTANT_Utf8_info结构
     */
    private short descriptorIndex;
}
