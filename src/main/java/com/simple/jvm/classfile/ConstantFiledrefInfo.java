package com.simple.jvm.classfile;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * CONSTANT_Fieldref_info {
 *     u1 tag;
 *     u2 class_index;
 *     u2 name_and_type_index;
 * }
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ConstantFiledrefInfo extends ConstantInfo {
    /**
     * class_index项的值必须是对常量池表的有效索引，常量池表在该索引处的项必须是：
     * CONSTANT_Class_info结构，此结构表示一个类或者接口，当前字段或方法时这个类或接口的成员。
     * CONSTANT_Methodref_info结构的class_index项，表示的必须是类（而不能是接口）。
     * CONSTANT_InterfaceMethodref_info结构的class_index项，表示的必须是接口类型。
     * CONSTANT_Fieldref_info结构的class_index项既可以表示类也可以表示接口。
     */
    private short classIndex;
    /**
     * name_and_type_index项的值必须是对常量池表的有效索引，
     * 常量池表在该索引处的项必须是CONSTANT_NameAndType_info结构，它表示当前字段或方法的名字和描述符。
     *
     * 如果一个CONSTANT_Methodref_info结构的方法名以"<"开头，那么，方法名必须是特殊的<init>，
     * 即这个方法时实例初始化方法，它的返回类型必须是void。
     */
    private short nameAndTypeIndex;
}
