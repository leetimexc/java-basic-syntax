package com.cainiao.array;

public class TestArray {
    public static void main(String[] args) {
        TestArray2 testArray2 = new TestArray2();
        testArray2.soutTotal();
        System.out.println("=====================");

        TestArray3 testArray3 = new TestArray3();
        testArray3.soutAll();
        testArray3.soutTotal();
        testArray3.soutMax();
    }
}

class TestArray2 {

    public void soutTotal(){
        // 数组大小
        int size = 10;

        // 定义数组
        double[] myList = new double[size];
        myList[0] = 1.9;
        myList[1] = 2.9;
        myList[2] = 3.4;
        myList[3] = 3.5;
        myList[4] = 4.5;
        myList[5] = 5.5;
        myList[6] = 6.5;
        myList[7] = 7.5;
        myList[8] = 8.5;
        myList[9] = 9.5;

        double total = 0;
        for(int i = 0; i < myList.length; i++){
            total = total + myList[i];
        };
        System.out.println("Total is " + total);
    }

}

class TestArray3 {
    double[] myList = {1.9, 2.9, 3.4, 3.5};

    // 打印所有数组元素
    public void soutAll(){
        for (double v : myList) {
            System.out.println(v);
        };
    }

    // 计算所有元素的总和
    public void soutTotal(){
        double total = 0;
        for (double v : myList) {
            total = total + v;
        };
        System.out.println("Total is " + total);
    }

    // 查找最大元素
    public void soutMax(){
        double max = myList[0];
        for(int i = 1; i < myList.length; i++){
            if(myList[i] > max){
                max = myList[i];
            }
        };
        System.out.println("Max is " + max);
    }
}