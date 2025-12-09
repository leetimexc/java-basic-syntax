package com.nineshadow.javabean;

public class Test {
    public static void main(String[] args) {
        // 目标: 搞清楚实体类是啥？ 搞清楚其基本作用和应用场景。
        // 实体类的基本作用：创建它的对象，存储数据（封装数据）
        Student s1 = new Student();
        s1.setName("张三");
        s1.setChinese(80);
        s1.setMath(90);
        System.out.println(s1.getName());
        System.out.println(s1.getChinese());
        System.out.println(s1.getMath());

        System.out.println("===================");

        Student s2 = new Student("李四", 100, 90);
        System.out.println(s2.getName());
        System.out.println(s2.getChinese());
        System.out.println(s2.getMath());

        System.out.println("===================");
        // 方法1：实体类在开发中的应用场景。
        // StudentOperator operator = new StudentOperator();
        // operator.printScore(s1);
        // operator.printAverageScore(s1);

        // 方法2：实体类在开发中的应用场景。
        StudentOperator operator = new StudentOperator(s2);
        operator.printScore();
        operator.printAverageScore();

    }
}
