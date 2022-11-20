package com.atguigu.java;

public class ArrayReview {
    public static void main(String[] args) {
        //1.一维数组的声明和初始化
        //声明
        int arr;
        //初始化
        arr=10;
        //声明+初始化
        int id=1001;
        //1.1 静态初始化：数组的初始化和数组元素的赋值操作同时进行
        int arrs[]; //声明
        arrs=new int[]{1,2,3,4,5};//初始化
        //1.2 动态初始化：数组的初始化和数组元素的赋值分开进行
        String names[]=new String[5]; //声明
        //总结：数组一旦初始化完成，数组的长度就确定了。
        //初始化
        names[0]="zhangsan";
        names[1]="lisi";
        names[2]="wangwu";
        names[3]="zhaoliu";
        names[4]="tianqi";
//        names[5]="liangxiu";//error - ArraysOutOfBounds - 数组下标越界

        //2.访问数组指定位置的元素 - 通过数组名[下标]的方式访问
        //在Java中，数组元素下标从0开始，最大为数组长度-1
        System.out.println(names[0]);//zhangsan
        System.out.println(names[4]);//tianqi

        //3.获取数组的长度 - 数组名.length
        System.out.println(arrs.length);//5
        System.out.println(names.length);//5

        //4.遍历数组 - for循环
        for (int i = 0; i < arrs.length ; i++) {
            System.out.print(arrs[i]+" ");
        }
        System.out.println();
        System.out.println("-----------------------------");

        for (int i = 0; i <names.length ; i++) {
            System.out.print(names[i]+" ");
        }
        System.out.println();
        System.out.println("-----------------------------");

        //5.数组元素的默认初始值

        System.out.println("int型数组默认初始值："); //0
        int intValue[]=new int[4];
        for (int i = 0; i <intValue.length ; i++) {
            System.out.print(intValue[i]+" ");
        }
        System.out.println();
        System.out.println("short型数组默认初始值：");//0
        short shortValue[]=new short[4];
        for (int i = 0; i <shortValue.length ; i++) {
            System.out.print(shortValue[i]+" ");
        }
        System.out.println();
        System.out.println("byte型数组默认初始值：");//0
        byte byteValue[]=new byte[4];
        for (int i = 0; i <byteValue.length ; i++) {
            System.out.print(byteValue[i]+" ");
        }
        System.out.println();
        System.out.println("float型数组默认初始值：");//0.0
        float floatValue[]=new float[4];
        for (int i = 0; i <floatValue.length ; i++) {
            System.out.print(floatValue[i]+" ");
        }
        System.out.println();
        System.out.println("double型数组默认初始值：");//0.0
        double doubleValue[]=new double[4];
        for (int i = 0; i <doubleValue.length ; i++) {
            System.out.print(doubleValue[i]+" ");
        }
        System.out.println();
        System.out.println("char型数组默认初始值：");//0或'\u0000',而非'\0'
        char charValue[]=new char[4];
        for (int i = 0; i <charValue.length ; i++) {
            System.out.print(charValue[i]+" ");
        }
        System.out.println();
        if(charValue[2]==0){
            System.out.println("hello");
        }
        System.out.println("boolean型数组默认初始值："); //false
        boolean booleanValue[]=new boolean[4];
        for (int i = 0; i <booleanValue.length ; i++) {
            System.out.print(booleanValue[i]+" ");
        }

    }

}
