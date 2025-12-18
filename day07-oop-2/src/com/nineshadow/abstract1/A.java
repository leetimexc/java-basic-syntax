package com.nineshadow.abstract1;

// 抽象类
public abstract class A {
    private String name;
    private int age;

    public A(){
        System.out.println("无参构造方法");
    }

    public A(String name, int age){
        System.out.println("有参构造方法");
    }

    // 抽象方法: 必须用abstract修饰,没有方法体，只有方法声明。
    public abstract void show();

    public void show1(){
        System.out.println("普通方法");
    }
}