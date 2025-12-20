package com.cainiao.object_class;

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);

        s1.study();
        s1.introduction();

        System.out.println("========================");

        Student s2 = new Student("李四", 18);
        s2.study();
        s2.introduction();
    }
}
