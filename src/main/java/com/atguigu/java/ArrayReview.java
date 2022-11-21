package com.atguigu.java;

public class ArrayReview {
    public static void main(String[] args) {
    //一、一维数组
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
        /**
         * 二、二维数组
         *   Java语言提供了支持多维数组的用法。
         *   规定：二维数组分为外层数组元素、内层数组元素。
         *   理解：对二维数组的理解，可以看成是一维数组arr1有作为另一个一维数组arr2的元素而存在。
         *   从数组的底层机制来看，其实没有多维数组。
         */
        //1.二维数组的声明和初始化
        //静态初始化
        int array[][]=new int[][]{{1,2,3},{4,5},{6,7,8}};//声明+初始化
        //动态初始化
        String array1[][]=new String[4][3];
        String array2[][]=new String[4][];
        //err:
//        String array3[][]=new String[][3];
//        int array4[][]=new int[3][3]{{1,2,3},{4,5},{6,7,8}};//声明+初始化
        int[] array5[]=new int[][]{{1,2,3,4},{5,6,7},{8,9,0}};//类型推断

        //2.调用数组指定位置的元素 - 数组名[行标][列标]
        System.out.println(array[1][0]);//4
        System.out.println(array1[3][2]);//null

        //3.获取数组的长度 - 数组名.length
        System.out.println(array.length);//3
        System.out.println(array5[0].length);//4 数组名[行标].length 每行拥有的元素个数

        //4.遍历二维数组 - 双层for循环
        for (int i = 0; i <array5.length ; i++) {
            for (int j = 0; j <array5[i].length ; j++) {
                System.out.print(array5[i][j]+" ");
            }
            System.out.println();
        }

        //5.数组元素的默认初始化值
        int[] ints[]=new int[4][3];
        //外层元素的初始化值：数组名[行标]默认值：数组名[行标][0]元素的首地址
        System.out.println(ints[1]);//[I@26ba2a48
        //内层元素的初始化值：数组名[行标][列标]默认值：与一维数组一致
        System.out.println(ints[1][0]);//0

        float[] floats[]=new float[4][];
        System.out.println(floats[1]);//null
        System.out.println(floats[2][3]);//err - NullPointerException
    }

}
