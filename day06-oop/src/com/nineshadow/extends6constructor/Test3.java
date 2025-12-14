package com.nineshadow.extends6constructor;

public class Test3 {
    public static void main(String[] args) {
        // 目标：理解this(...)调用兄弟构造器
        // 创建对象，存储一个学生的数据。
        Student s1 = new Student("季候风", '男', 18, "上海大学");
        System.out.println(s1);

        Student s2 = new Student("刘紫欣", '女', 18, "上海大学");
        System.out.println(s2);

        Student s3 = new Student("王菲", '女', 18);
        System.out.println(s3);
    }
}
