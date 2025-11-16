package com.nineshadow.literal;
/*
* 目标： 掌握常见字面量的书写格式
* */
public class LiteralDemo {
    public static void main(String[] args) {
        printLiteral();
    }

    public static void printLiteral(){
        // 请帮我直接输出常见的字面量
        // 1. 布尔型字面量，只有true和false
        System.out.println(true);
        System.out.println(false);
        // 3. 整型字面量，直接写
        System.out.println(10);
        // 4. 浮点型字面量，直接写(小数)
        System.out.println(10.5);
        // 5. 字符型字面量，用单引号括起来，里面有且仅有一个字符
        System.out.println('a');
        System.out.println('中');
        System.out.println(' '); // 空白字符
        System.out.println("hello world");

        // 掌握一些特殊的字符：\n（换行功能） \t（Tab缩进功能）
        System.out.println("hello\nworld");
        System.out.println("hello\tworld");


        // 6. 字符串字面量，用双引号括起来，里面可以有多个字符
        System.out.println("hello world");
        System.out.println("   ");
        System.out.println("   asfdsjfhjk");
        System.out.println("   asfdsjfhjk   ");
    }
}
