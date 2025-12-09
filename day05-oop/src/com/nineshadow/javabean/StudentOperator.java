package com.nineshadow.javabean;

public class StudentOperator {
//    // 提供方法： 打印学生对象的总成绩
//    public void printScore(Student s){
//        System.out.println(s.getName() + "的总成绩是：" + (s.getChinese() + s.getMath()));
//    }
//
//    // 提供方法：打印学生对象平均成绩
//    public void printAverageScore(Student s){
//        System.out.println(s.getName() + "的平均成绩是：" + (s.getChinese() + s.getMath()) / 2);
//    }
    // 方法2：
    // 必须拿到要处理的学生对象
    private Student s; // 用于存储要处理的学生对象

    // 有参构造器
    public StudentOperator(Student s){
        this.s = s;
    }

    // 提供方法
    public void printScore(){
        System.out.println(s.getName() + "的总成绩是：" + (s.getChinese() + s.getMath()));
    }
    public void printAverageScore(){
        System.out.println(s.getName() + "的平均成绩是：" + (s.getChinese() + s.getMath()) / 2);
    }
}
