package com.nineshadow.array;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 目标：掌握数组的另一种定义：动态初始化数组
        inputScore();
    }

    // 设计一个方法录入学生成绩
    public static void inputScore() {
        // 1. 定义一个数组，存储学生成绩
        double[] scores = new double[8];

        // 2. 录入学生成绩，存入数组中
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
            scores[i] = sc.nextDouble();
        }

        // 3. 遍历数组，统计总分，统计最高分，统计最低分
        double sum = 0.0;
        double max = scores[0];
        double min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
            } else if (scores[i] < min) {
                min = scores[i];
            }
        }
        System.out.println("总分是：" + sum);
        System.out.println("最高分是：" + max);
        System.out.println("最低分是：" + min);
        System.out.println("平均分是：" + sum / scores.length);
    }
}
