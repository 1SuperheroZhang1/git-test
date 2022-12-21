package com.atguigu.java.lanqiao.exer;

import java.util.Scanner;

/*
* 【问题描述】
　　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
  【输入格式】
    　　输入一行，包含一个正整数n。
  【输出格式】
　　按从小到大的顺序输出满足条件的整数，每个整数占一行。
* 【样例输入】
    52
  【样例输出】
    899998
    989989
    998899
* */
public class BASIC_09 {
    public static void main(String[] args) {
        int i,j,n,tmp,sum;
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        for (i=10000;i<=999999;i++) {
            tmp=i;
            sum=0;
            for (j=0; j<6; j++) { //剥离出i的每一位
                arr[j]=tmp%10;
                tmp/=10;
                sum+=arr[j];
            }
            //判断五位十进制数
            if((i<=99999)&&((arr[0]==arr[4])&&(arr[1]==arr[3]))&&(sum==n)){
                System.out.println(i);
            }
            //判断六位十进制数
            if((i>=100000)&&((arr[0]==arr[5])&&(arr[1]==arr[4])&&(arr[2]==arr[3]))&&(sum==n)){
                System.out.println(i);
            }
        }
    }
}
