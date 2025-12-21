package com.cainiao.OOP.fengzhuang;

public class Test1 {
    public static void main(String[] args) {
        nameClass obj = new nameClass();
        obj.setName("Fengzhuang");
        String xxx = obj.getName(); // 片段1
        System.out.println("输出"+xxx);
    }
}

class nameClass {
    private String name; // 错误，不能定义私有变量

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}