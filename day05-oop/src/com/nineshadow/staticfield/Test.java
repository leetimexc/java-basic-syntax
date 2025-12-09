package com.nineshadow.staticfield;

public class Test {
    public static void main(String[] args) {
        // 目标： 认识static修饰成员变量，特点、访问机制，搞清楚作用。
        // 1. 类名.静态变量（推荐）
        Student.name = "袁华";
        System.out.println(Student.name);

        System.out.println("=======================");
        // 2. 对象名.静态变量（不推荐）
        Student s1 = new Student();
        s1.name = "秋雅";
        System.out.println(s1.name);
        System.out.println("=======================");

        System.out.println(Student.name);
        System.out.println(s1.name);

        System.out.println("=======================");
        // 3. 对象名.实例变量
        s1.age = 18;
        Student s2 = new Student();
        s2.age = 20;
        System.out.println(s1.age);
        System.out.println(s2.age);

    }
}
