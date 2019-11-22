package com.simple.jvm;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

// Java class文件结构（规范篇） - 简书
//https://www.jianshu.com/p/68520593b999
public class Main {

    /*
    ClassFile {
        u4             magic;
        u2             minor_version;
        u2             major_version;
        u2             constant_pool_count;
        cp_info        constant_pool[constant_pool_count-1];
        u2             access_flags;
        u2             this_class;
        u2             super_class;
        u2             interfaces_count;
        u2             interfaces[interfaces_count];
        u2             fields_count;
        field_info     fields[fields_count];
        u2             methods_count;
        method_info    methods[methods_count];
        u2             attributes_count;
        attribute_info attributes[attributes_count];
    }
    */
    /*
    cp_info {
        u1 tag;
        u1 info[];
    }
    CONSTANT_Class_info {
        u1 tag;
        u2 name_index;
    }
    CONSTANT_Fieldref_info {
        u1 tag;
        u2 class_index;
        u2 name_and_type_index;
    }
    CONSTANT_Methodref_info {
        u1 tag;
        u2 class_index;
        u2 name_and_type_index;
    }
    CONSTANT_InterfaceMethodref_info {
        u1 tag;
        u2 class_index;
        u2 name_and_type_index;
    }
    CONSTANT_String_info {
        u1 tag;
        u2 string_index;
    }
    CONSTANT_Integer_info {
        u1 tag;
        u4 bytes;
    }
    CONSTANT_Float_info {
        u1 tag;
        u4 bytes;
    }
    CONSTANT_Long_info {
        u1 tag;
        u4 high_bytes;
        u4 low_bytes;
    }
    CONSTANT_Double_info {
        u1 tag;
        u4 high_bytes;
        u4 low_bytes;
    }
    CONSTANT_NameAndType_info {
        u1 tag;
        u2 name_index; //name_index 项的值必须是对常量池的有效索引， 常量池在该索引处的项必须是
        CONSTANT_Utf8_info结构，这个结构要么表示特殊的方法名<init>，要么表示一个有效
        的字段或方法的非限定名（ Unqualified Name）。
        u2 descriptor_index;//descriptor_index 项的值必须是对常量池的有效索引， 常量池在该索引
        处的项必须是CONSTANT_Utf8_info结构。
    }
    CONSTANT_Utf8_info {
        u1 tag;
        u2 length;
        u1 bytes[length];
    }
    CONSTANT_MethodHandle_info {
        u1 tag;
        u1 reference_kind;//reference_kind 项的值必须在 1 至 9 之间（包括 1 和 9），它决定了方法句柄的类型。
        方法句柄类型的值表示方法句柄的字节码行为。
        u2 reference_index;//reference_index 项的值必须是对常量池的有效索引。
    }
    CONSTANT_MethodType_info {
        u1 tag;
        u2 descriptor_index;
    }
    CONSTANT_InvokeDynamic_info {
        u1 tag;
        u2 bootstrap_method_attr_index;
        u2 name_and_type_index;
    }
     */
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Main.class.getResourceAsStream("/Main.class");
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        int magic = dataInputStream.readInt();
        if (magic != 0xCAFEBABE) {
            throw new ClassFormatError("class file magic incorrect");
        }

        int minorVersion = dataInputStream.readUnsignedShort();
        int majorVersion = dataInputStream.readUnsignedShort();

        short constantPoolCount = dataInputStream.readShort();

        System.out.println(minorVersion);
        System.out.println(majorVersion);
        System.out.println(constantPoolCount);

        for (int i = 0; i < constantPoolCount; i++) {
            byte tag = dataInputStream.readByte();
            switch (tag) {
                case ConstantPoolTag.CONSTANT_Class:
                    short nameIndex = dataInputStream.readShort();
                    System.out.println("CONSTANT_Class, name_index=" + nameIndex);
                    break;
                case ConstantPoolTag.CONSTANT_Utf8:
                    String str = dataInputStream.readUTF();
                    System.out.println("CONSTANT_Utf8, str=" + str);
                    break;
            }
        }
    }
}
