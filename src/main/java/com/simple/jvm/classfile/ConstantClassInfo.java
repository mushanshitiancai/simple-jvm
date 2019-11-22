package com.simple.jvm.classfile;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * CONSTANT_Class_info 结构用于表示类或接口
 *
 * CONSTANT_Class_info {
 *     u1 tag;
 *     u2 name_index;
 * }
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ConstantClassInfo extends ConstantInfo {
    /**
     * name_index项的值必须是堆常量池表的一个有效索引
     * 常量池表在该索引处的成员必须是CONSTANT_Utf8_info结构，此结构代表一个有效的类或者接口二进制名称的内部形式
     */
    private short nameIndex;
}

