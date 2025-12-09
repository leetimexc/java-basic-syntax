package com.nineshadow.capsulation;

public class Test {
    public static void main(String[] args) {
        // 目标：搞清楚封装的设计思想：合理隐藏合理暴漏。学会如何隐藏如何暴漏。
        Student s1 = new Student();
        s1.name = "张三";
        // s1.age = 18;
        s1.setAge(24);
        System.out.println(s1.name);
        // System.out.println(s1.age);
        System.out.println(s1.getAge());
    }
}
