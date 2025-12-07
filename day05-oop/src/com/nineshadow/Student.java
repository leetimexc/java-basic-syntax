package com.nineshadow;

// 学生类
//public class Student {
//    String name;
//    double chinese;
//    double math;
//}

// 封装：把数据
public class Student {
    String name;
    double chinese;
    double math;

    public void show() {
        System.out.println(name + "的语文成绩是：" + chinese);
        System.out.println(name + "的数学成绩是：" + math);
    }

    public void average() {
        System.out.println(name + "的平均成绩是：" + (chinese + math) / 2);
    }
}