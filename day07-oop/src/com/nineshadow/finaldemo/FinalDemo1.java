package com.nineshadow.finaldemo;

public class FinalDemo1 {

    // final 修饰静态成员变量  必须要赋值
    // 常量的名称，建议全部大写，多个单词用下划线链接 SCHOOL_NAME
    public static final double PI = 3.14;

    public static void main(String[] args) {
        // 目标： 认识final修饰符，特点、访问机制，搞清楚作用。
        // 3. final修饰变量： 赋值一次，不能被修改
        /*
            变量有哪些呢？
            a、成员变量：
                静态成员变量
                实例成员变量
            b、局部变量
         */
            final double rate = 3.14;
            rate = 3.16;

    }

    public  static void buy(final double z){
        // z = 10; // 无法将值赋给 final 变量 'z'
        System.out.println(z);
    }
}


// 1. final修饰类，父类不能被继承
//class Father{}
//class Son extends Father{}

// 1. final修饰类，父类不能被继承 [不能继承]
//final class Father{}
//无法继承自 final 类 'com.nineshadow.finaldemo.Father'
//class Son extends Father{}

// 2. final修饰方法，方法不能被重写
//class Father{
//    public final void show(){}
//}
//class Son extends Father{
//    @Override
//    // 'show()' 无法重写 'com.nineshadow.finaldemo.Father' 中的 'show()'；被重写的方法为 final
//    public void show(){}
//}

