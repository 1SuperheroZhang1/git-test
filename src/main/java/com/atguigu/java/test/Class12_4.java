package com.atguigu.java.test;

public class Class12_4 {
    public static void main(String[] args) { //args为主方法入口参数
//        for (String arg : args) {
//            System.out.print(arg);
//        }
        //原因：args数组是字符串数组，不能实现两个数的相加，只能实现两数的拼接
//        System.out.println(args[0]+args[1]);//error:实现的是字符串的拼接
        int size=args.length;
        //创建一个和args等长的数组，将args中的每个元素转换为int类型存储到arr数组中
        int[] arr=new int[size];
        for (int i = 0; i < size ; i++) {
            arr[i]=Integer.parseInt(args[i]);
        }
        //实现两数的相加
        System.out.println(arr[0]+arr[2]);


    }
}
