package com.cainiao.object_class.animal;

public class Test {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.eat();
        cat.sleep();
        cat.climb();
        System.out.println("===========");
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
