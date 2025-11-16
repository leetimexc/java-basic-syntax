package com.nineshadow.hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // 打印十行hello world
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }

        // 调用验证码生成方法并打印结果
        System.out.println(getVerifyCode());
    }
    // 定义一个方法，帮我生成一个验证码返回
    public static String getVerifyCode() {
        String code = "";
        for (int i = 0; i < 4; i++) {
            int number = (int) (Math.random() * 10);
            code += number;
        }
        return code;
    }
}
