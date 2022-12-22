package com.atguigu.java.lanqiao.exer;

import java.util.Scanner;

/*
    十六进制转十进制
* 【问题描述】
    　　从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
　　    注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
  【样例输入】
        FFFF
  【样例输出】
        65535
* */
public class BASIC_11 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String hex = sc.next();
//        int result=0,z=0;
//        for (int i = 0; i <hex.length() ; i++) {
//            if(hex.charAt(i)>='0'&&hex.charAt(i)<='9'){
//                result+=(hex.charAt(i)-'0')*Math.pow(16,z);
//            }
//            if(hex.charAt(i)>='A'&&hex.charAt(i)<='F'){
//                result+=(hex.charAt(i)-'A'+10)*Math.pow(16,z);
//            }
//            z++;
//        }
//
//        System.out.println(result);
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        /*
        * Integer类中的valueOf()方法的真正用途就体现在进制的互相转换之上，第一个参数接收一个字符串第二个参数为进制基数
        * */
        System.out.println(Integer.valueOf(str,16).toString());
    }
}
