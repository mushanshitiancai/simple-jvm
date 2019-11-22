package com.simple.jvm.classfile;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * CONSTANT_Utf8_info用于表示字符常量的值
 *
 * CONSTANT_Utf8_info {
 *     u1 tag;
 *     u2 length;
 *     u1 bytes[length];
 * }
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ConstantUtf8Info extends ConstantInfo {
    /**
     * length项的值指明了bytes[]数组的长度(注意，不能等同于当前结构所表示的String对象的长度)。
     * CONSTANT_Utf8_info结构中的内容以length属性来确定长度，而不以null作为字符串的终止符
     */
    private short length;
    /**
     * bytes[]是表示字符串值的byte数组，bytes[]中每个成员的byte值都不会是0，也不在0xf0~0xff范围内
     */
    private byte[] bytes;
}
