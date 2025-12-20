package com.cainiao.object_class;

public class Student {

    // 定义私有的实例变量
    private String name;
    private int age;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    //定义方法
    public void study() {
        System.out.println(name + "正在学习");
    }

    public void introduction() {
        System.out.println("我叫" + name + "，今年" + age + "岁");
    }

}
