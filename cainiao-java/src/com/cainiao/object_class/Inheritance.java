package com.cainiao.object_class;

public class Inheritance {
    // 一个类可以继承另一个类的属性和方法
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.run();
        dog.lookHome();
    }
}

// 继承的语法格式：
// class 子类 extends 父类 {
//     // 子类的属性和方法
// }
class Animal {
    public void eat() {
        System.out.println("吃");
    }

    public void sleep() {
        System.out.println("睡");
    }

    public void run() {
        System.out.println("跑");
    }


}

class Dog extends Animal {
    public void lookHome() {
        System.out.println("看家");
    }
}

