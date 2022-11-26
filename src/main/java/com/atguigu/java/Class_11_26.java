package com.atguigu.java;



import java.util.Scanner;

public class Class_11_26 {
    public static void main(String[] args) {

        /**
         * 一、运算符
         1. 在Java中，逻辑非，只能用在布尔表达式中。如：!true或者!false
         2. Java中的赋值符号：<<= >>>= &&  在Java中没有<<<=符号
         * */
        //        int a=10;
//        System.out.println(!a);//error - Operator '!' cannot be applied to 'int'

        /**二、选择语句
         * 编写程序数一下 1到 100 的所有整数中出现多少个数字9
         * */
//        int count=0;
//        for(int i=1;i<=100;i++){
//            if(i%10==9){ //判断个位的9
//                count++;
//            }
//            if(i/10==0){ //判断十位的9
//                count++;
//            }
//        }
//        System.out.println(count);//19

        /*
         * 三、循环语句
         * 1.打印 X 图形:多组输入，一个整数（2~20），表示输出的行数，也表示组成“X”的反斜线和正斜线的长度。
         * 2.
         * */
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入：");
        int n = sc.nextInt();
//        int count=5;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(j==i){
                    System.out.print("*");
                }else if(j==n-i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
