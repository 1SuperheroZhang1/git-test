package com.atguigu.java.lanqiao.exer;

import java.util.Arrays;
import java.util.Scanner;

/*
* 【问题描述】
　　    给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
  【输入格式】
    　　第一行为一个整数n。
    　　第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
  【输出格式】
    　　输出一行，按从小到大的顺序输出排序后的数列。
  【样例输入】
        5
        8 3 6 4 9
  【样例输出】
        3 4 6 8 9
* */
public class BASIC_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
