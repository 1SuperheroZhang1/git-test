package com.atguigu.java.lanqiao.exer;

import java.util.Arrays;
import java.util.Scanner;

/*
* 【问题描述】
       给定一个序列，每次询问序列中第l个数到第r个数中第K大的数是哪个。
  【输入格式】
      第一行包含一个数n，表示序列长度。
      第二行包含n个正整数，表示给定的序列。
      第三个包含一个正整数m，表示询问个数。
   接下来m行，每行三个数l,r,K，表示询问序列从左往右第l个数到第r个数中，从大往小第K大的数是哪个。序列元素从1开始标号。
  【输出格式】
      总共输出m行，每行一个数，表示询问的答案。
  【样例输入】
        5
        1 2 3 4 5
        2
        1 5 2
        2 3 2
  【样例输出】
        4
        2
* */
public class ALGO_1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       //1.第一行包含一个数n，表示序列长度
       int n = sc.nextInt();

       //2.第二行包含n个正整数，表示给定的序列
        Scanner sc1=new Scanner(System.in);
        String str = sc1.nextLine();

        //3.第三个包含一个正整数m，表示询问个数。
        int m = sc1.nextInt();

        //4.接下来m行，每行三个数l,r,K，表示询问序列从左往右第l个数到第r个数中，从大往小第K大的数是哪个。序列元素从1开始标号。
        Scanner sc2=new Scanner(System.in);
        int arr[][]=new int[m][3];
        for (int i = 0; i < m ; i++) {
            String str1 = sc2.nextLine();
            String[] str2 = str1.split("\\s");
            for (int j = 0; j < 3; j++) {
                //将输入的字符串存放到整型的二维数组中
                arr[i][j]=Integer.parseInt(str2[j]);
            }
        }

        //截取字符串
        for (int i = 0; i < m; i++) {
            //截取字符串第l到r个数
            String str3 = str.substring(arr[i][0]-1, arr[i][1]);
            int arr2[]=new int[str3.length()];
            for (int j = 0; j <str3.length() ; j++) {
                arr2[j]=Integer.parseInt(String.valueOf(str3.charAt(j)));
            }
            Arrays.sort(arr2);
            //打印从左往右第k大个数
            System.out.println(arr2[arr2.length-arr[i][2]]);
        }

    }
}
