package com.simple.jvm.classfile;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * CONSTANT_InvokeDynamic_info结构用于表示invokedynamic指令所用到的引导方法(bootstrap method)、
 * 引导方法所用到的动态调用名称(dynamic invocation name)、参数和返回类型，
 * 并可以给引导方法传入一系列称为静态参数(static argument)的常量。
 *
 * CONSTANT_InvokeDynamic_info {
 *     u1 tag;
 *     u2 bootstrap_method_attr_index;
 *     u2 name_and_type_index;
 * }
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ConstantInvokeDynamicInfo extends ConstantInfo {
    /**
     * bootstrap_method_attr_index项的值必须是对当前class文件中引导方法表的bootstrap_methods数组的有效索引
     */
    private short bootstrapMethodAttrIndex;
    /**
     * name_and_type_index项的值必须是对常量池表的有效索引，
     * 常量池表在该索引处的成员必须是CONSTANT_NameAndType_info结构，此结构表示方法名和方法描述符
     */
    private short nameAndTypeIndex;
}
