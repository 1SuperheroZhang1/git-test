package com.atguigu.java.lanqiao.exer;

import java.util.Scanner;

/*
* 【问题描述】
        给定圆的半径r，求圆的面积。
  【输入格式】
        输入包含一个整数r，表示圆的半径。
  【输出格式】
        输出一行，包含一个实数，四舍五入保留小数点后7位，表示圆的面积。
  【样例输入】
        4
  【样例输出】
        50.2654825
* */
public class BASIC_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r = sc.nextInt();
        double square = Math.PI * r * r;
        //String.format("%.7f",square);
        //通过"%.xf"输出：其中x表示精确到小数点后几位
        System.out.println(String.format("%.7f",square));
    }
}
