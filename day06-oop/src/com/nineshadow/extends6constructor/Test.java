package com.nineshadow.extends6constructor;

public class Test {
    public static void main(String[] args) {
        zi z = new zi();
    }
}

class zi extends fu {
    public zi() {
//        super();  // 默认存在的，写不写都有
        super(1); // 制定调用有参构造器
        System.out.println("zi()");
    }
}

class fu {
    public fu() {
        System.out.println("fu()");
    }
//    private fu(){
//        System.out.println("fu()");
//    }

    public fu(int a) {
        System.out.println("fu(int a)");
    }
}