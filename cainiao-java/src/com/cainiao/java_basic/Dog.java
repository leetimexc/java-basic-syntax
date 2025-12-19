package com.cainiao.java_basic;

public class Dog {
   // 实例变量
    private String name;
    private String color;
    private String breed;

    // 构造方法
    public Dog(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    // 方法
    public void bark() {
        System.out.println(name+" is barking...");
    }

    public void wagtTail() {
        System.out.println(name+" is wagging tail...");
    }
    public void eat() {
        System.out.println(name+" is eating...");
    }
}
