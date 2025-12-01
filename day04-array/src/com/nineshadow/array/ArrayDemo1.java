package com.nineshadow.array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 目标：认识使用数组的好处，数组的定义，访问。
        callStudent();
    }

    // 请帮我开发一个随机点名的方法，假设有15名学生
    public static void callStudent(){
        String[] names = {"小王","小李","小张","小赵","小钱","小孙"};
        int index = (int)(Math.random()*names.length);
        System.out.println(names[index]);
    }

}
