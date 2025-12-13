package com.nineshadow.extends5override;

public class Test {
    public static void main(String[] args) {
        // 目标：认识方法重写，再搞清楚场景。
        Dog obj = new Dog();
        obj.cry();
    }
}

class Dog extends Animal{
    @Override // 方法重写的标记 可以不写，但是建议写上，写的错误会提示
    // 重写方法要求：方法名相同，参数列表相同，否则无法重写
    public void cry(){
        System.out.println("汪汪汪～～～");
    }
}

class Animal{
    public void cry(){
        System.out.println("动物会叫～～～");
    }
}