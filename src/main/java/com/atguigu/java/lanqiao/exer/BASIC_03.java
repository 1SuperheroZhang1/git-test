package com.atguigu.java.lanqiao.exer;

import java.util.Scanner;

/*
* 【问题描述】
            利用字母可以组成一些美丽的图形，下面给出了一个例子：
            ABCDEFG
            BABCDEF
            CBABCDE
            DCBABCD
            EDCBABC
            这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
   【输入格式】
            输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
   【输出格式】
            输出n行，每个m个字符，为你的图形。
   【样例输入】
            5 7
   【样例输出】
            ABCDEFG
            BABCDEF
            CBABCDE
            DCBABCD
            EDCBABC
* */
public class BASIC_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char ch[][]=new char[n][m];
        //第一行
        for (int i = 0; i < m ; i++) {
            ch[0][i]=(char)('A'+i);
        }
        //第一列
        for (int j = 0; j < n ; j++) {
            ch[j][0]=(char)('A'+j);
        }
        //第i行第j列
        for (int i = 1; i < n ; i++) {
            for (int j = 1; j < m ; j++) {
                ch[i][j]=ch[i-1][j-1];
            }
        }
        //输出
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                System.out.print(ch[i][j]);
            }
            System.out.println();
        }
    }
}
