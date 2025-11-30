package com.nineshadow.branch;

public class ifTest2 {
    public static void main(String[] args) {
        // 目标： 完成自动汽车驾驶程序的书写，以便可以根据红绿灯状态正确形式。

    }

    public static void test1() {
        // 1.假设现在通过摄像头获取到了三种灯的状态信息如下
        boolean red = true;
        boolean yellow = false;
        boolean green = false;

        if (red) {
            System.out.println("红灯停");
        } else if (yellow) {
            System.out.println("黄灯等");
        } else {
            System.out.println("绿灯行");
        }
    }
}
