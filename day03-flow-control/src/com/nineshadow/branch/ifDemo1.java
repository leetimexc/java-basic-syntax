package com.nineshadow.branch;

public class ifDemo1 {
    public static void main(String[] args) {
        // 目标：认识if语句，搞清楚其写法和应用场景。
        demo1();
        demo2();
        demo3();
    }

    public static void demo1() {
        int age = 20;
        if (age >= 18) {
            System.out.println("可以投票");
            return ;
        }
        System.out.println("程序结束");
    }

    public static void demo2() {
       int money = 100;
       if(money>=80){
           System.out.println("可以买iphone");
       }else {
           System.out.println("不可以买iphone");
       }
    }

    public static void demo3() {
        // 绩效系统，每个月主管给员工打分
        System.out.println("请输入员工的绩效分数：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 70) {
            System.out.println("中等");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }

}
