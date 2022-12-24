package com.atguigu.java.lanqiao.exer;

import java.util.Scanner;

/*
* 【问题描述】
        求1+2+3+...+n的值。
  【输入格式】
        输入包括一个整数n。
  【输出格式】
        输出一行，包括一个整数，表示1+2+3+...+n的值。
  【样例输入】
        4
  【样例输出】
        10
  【样例输入】
        100
  【样例输出】
        5050
* */
public class BASIC_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
