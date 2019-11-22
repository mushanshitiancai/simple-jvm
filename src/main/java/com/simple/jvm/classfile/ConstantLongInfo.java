package com.simple.jvm.classfile;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * CONSTANT_Long_info表示8字节的long数值常量
 *
 * CONSTANT_Long_info {
 *     u1 tag;
 *     u4 high_bytes;
 *     u4 low_bytes;
 * }
 *
 * 在class文件的常量池表中，所有的8字节常量均占两个表成员（项）的空间。
 * 如果一个CONSTANT_Long_info或CONSTANT_Double_info结构的项在常量池表中的索引位n，
 * 则常量池表中下一个可用项的索引位n+2，此时常量池表中索引为n+1的项仍然有效但必须视为不可用。
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ConstantLongInfo extends ConstantInfo {
    private int value;
}
