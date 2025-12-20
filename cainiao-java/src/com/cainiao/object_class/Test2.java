package com.cainiao.object_class;

public class Test2 {
    public static void main(String[] args) {
        Person p1 = new Person();
//        p1.name = "Tom";
        p1.age = 25;
        p1.setName("Tom");
        System.out.println(p1.getName());
    }
}

class Person {
    private String name;
    public int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
