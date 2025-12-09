package com.nineshadow.capsulation;

public class Student {
    String name;
    // 1. 如何合理隐藏： 使用private修饰符,就只能在当前类中访问，其他类无法访问
    private int age;
    private double chinese;
    private double math;


    // 2. 如何合理暴漏： 提供public的get方法和set方法
    // 成员变量的取值和赋值
    public void setAge(int age){
        if (age >= 0 && age <= 120){
            this.age = age;
        }else {
            System.out.println("你输入的age有误");
        }
    }

    public int getAge(){
        return age;
    }
    public void printAllScore(){
        System.out.println(name + "的总成绩是：" + (chinese + math));
    }

    public void printAverageScore(){
        System.out.println(name + "的平均成绩是：" + (chinese + math) / 2);
    }
}
