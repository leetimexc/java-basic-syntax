package com.nineshadow.staticfield;

public class Student {
    // 静态变量：有static修饰，属于类，只加载一次，所有对象共享。
    static  String name;
    // 实例变量：没有static修饰，属于对象，每个对象都有一份。
    int age;
}
