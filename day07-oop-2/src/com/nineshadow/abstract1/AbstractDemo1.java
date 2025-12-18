package com.nineshadow.abstract1;

public class AbstractDemo1 {
    public static void main(String[] args) {
        // 目标：认识抽象类，抽象方法，搞清楚他们的特点。
        A a = new B();
        a.show1();
        a.show();
    }
}

// 继承A
class B extends A{
    @Override
    public void show() {
        System.out.println("B类实现抽象方法");
    }
}