package com.simple.jvm.classfile;

import lombok.Data;

/**
 * 所有的常量池项都具有如下通用格式：
 * cp_info {
 *     u1 tag;
 *     u1 info[];
 * }
 *
 * 在常量池表中，每个cp_info项都必须以一个表示cp_info类型的单字节"tag"项开头。
 * 后面info[]数组的内容由tag的值所决定。有效的tag和对应的值如下表：
 *
 * CONSTANT_Class	7
 * CONSTANT_Fieldref	9
 * CONSTANT_Methodref	10
 * CONSTANT_InterfaceMethodref	11
 * CONSTANT_String	8
 * CONSTANT_Integer	3
 * CONSTANT_Float	4
 * CONSTANT_Long	5
 * CONSTANT_Double	6
 * CONSTANT_NameAndType	12
 * CONSTANT_Utf8	1
 * CONSTANT_MethodHandle	15
 * CONSTANT_MethodType	16
 * CONSTANT_InvokeDynamic	18
 */
@Data
public class ConstantInfo {
    private byte tag;
}
