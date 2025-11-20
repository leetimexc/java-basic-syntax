package com.nineshadow.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        // 目标：掌握8种基本数据类型定义变量。
        printVariable();
    }

    // 请帮我设计一个方法，打印出8种基本数据类型定义的变量
    public static void printVariable(){
        // 1.整型
        byte b = 127;
        // byte b2 = 128; // 越界了，报错
        short s = 32767;
        int i = 2147483647;

        // 注意: 随便写一个整数字面量默认是int类型的，214748364755555这个数据虽然没有超过long的范围，但是超过了int的范围，所以会报错
        // 如果希望显示一个long类型的数据，必须加上L或者l，否则会被默认成int类型
        // long l1 = 214748364755555;
        long l1 = 214748364755555L;
        long l = 9223372036854775807L;

        // 2. 浮点型
        // 注意：随便写一个浮点数字面量默认是double类型的，如果希望是float类型数据，必须加上f或者F
        float f = 3.4028235E38f;  // float 基本被淘汰，都用 double
        double d = 1.7976931348623157E308d;

        // 3. 字符型
        char c = 'a';

        // 4. 布尔型
        boolean bool = true;

        // 5. 字符串型（引用类型）：定义字符串变量记住字符串数据的
        String str = "hello world";
        System.out.println(str);

    }
}
