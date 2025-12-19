package com.cainiao.object_class;

public class Test {
    public static void main(String[] args) {
        // 创建对象
        Car car = new Car("Toyota", "Red", 2023);
        // 调用方法
        car.startEngine();
        car.carColor();
        car.carYear();

    }
}
