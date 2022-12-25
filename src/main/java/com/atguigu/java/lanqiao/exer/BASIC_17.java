package com.atguigu.java.lanqiao.exer;

import java.util.Scanner;

/*
* 【问题描述】
    Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
    当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
  【输入格式】
        输入包含一个整数n。
  【输出格式】
        输出一行，包含一个整数，表示Fn除以10007的余数。
  【样例输入】
        10
  【样例输出】
        55
  【样例输入】
        22
  【样例输出】
        7704
* */
public class BASIC_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n = sc.nextLong();
        long fib = fibonacci(n);
        long mod = fib % 10007;
        System.out.println(mod);
    }

    static long fibonacci(long n){
        if(n==1||n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

}
