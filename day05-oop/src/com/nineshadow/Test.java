package com.nineshadow;

public class Test {
//    public static void main(String[] args) {
//        // 目标：创建学生对象存储学生数据，并操作学生数据
//        Student s1 = new Student();
//        s1.name = "张三";
//        s1.chinese = 90;
//        s1.math = 80;
//        System.out.println(s1.name + "的语文成绩是：" + s1.chinese);
//        System.out.println(s1.name + "的数学成绩是：" + s1.math);
//        System.out.println(s1.name + "的总成绩是：" + (s1.chinese + s1.math));
//
//        Student s2 = new Student();
//        s2.name = "李四";
//        s2.chinese = 80;
//        s2.math = 90;
//        System.out.println(s2.name + "的语文成绩是：" + s2.chinese);
//        System.out.println(s2.name + "的数学成绩是：" + s2.math);
//        System.out.println(s2.name + "的总成绩是：" + (s2.chinese + s2.math));
//    }

    public static void main(String[] args) {
        // 目标：创建学生对象存储学生数据，并操作学生数据
        Student s1 = new Student();
        s1.name = "张三";
        s1.chinese = 90;
        s1.math = 80;
        s1.show();
        s1.average();

        Student s2 = new Student();
        s2.name = "李四";
        s2.chinese = 80;
        s2.math = 90;
        s2.show();
        s2.average();
    }
}
