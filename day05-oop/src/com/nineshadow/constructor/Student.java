package com.nineshadow.constructor;

public class Student {
    String name;
    int age;
    char sex;
    // 1. 无参数构造器：
    // 构造器：是一种特殊方法，不能写返回值类型，名称必须是类名，就是构造器
    public Student() {
        System.out.println("无参数构造器");
    }

    // 2. 带参数构造器
    public Student(String name) {
        System.out.println("带参数构造器"+name);
    }

    // 3. 带参数
    public Student(String name, int age, char sex) {
        System.out.println("带参数构造器"+name+age+sex);
    }

}
