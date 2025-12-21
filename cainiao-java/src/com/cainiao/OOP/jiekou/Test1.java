package com.cainiao.OOP.jiekou;

public class Test1 {
    public static void main(String[] args) {
        Drivable c = new Car();
        c.drive();
    }
}

// 接口
interface Drivable {
    void drive(); // 抽象方法
}

// 实现接口的类
class Car implements Drivable {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}