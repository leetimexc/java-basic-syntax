package com.cainiao.object_class;

public class Car {
    private String brand; // 实例变量
    private String color;
    private int year;

    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public void startEngine() {
        System.out.println(brand + " engine started.");
    }

    public void carColor () {
        System.out.println(color + " engine started.");
    }

    public void carYear () {
        System.out.println(year + " engine started.");
    }
}
