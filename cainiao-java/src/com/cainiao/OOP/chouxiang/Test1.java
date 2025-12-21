package com.cainiao.OOP.chouxiang;

public class Test1 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}

// 抽象类
 abstract class Shape {
    abstract void draw(); // 抽象方法，无实现
}
 class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("画一个圆形");
    }
}