package com.nineshadow.staticMethods;

public class Test {
    // 静态方法，实例方法访问相关的几点注意事项
    // - 静态方法中可以访问静态成员，不可以直接访问实例成员变量和实例成员方法
    // - 实例方法中可以访问静态成员，也可以访问实例成员变量和实例成员方法
    // - 实例方法中可以出现this关键字，静态方法中不可以出现this关键字
}
