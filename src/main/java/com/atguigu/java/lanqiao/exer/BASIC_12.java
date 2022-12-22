package com.atguigu.java.lanqiao.exer;

import java.util.Scanner;

/*
    十六进制转八进制：先将十六进制转为十进制或者二进制，再将十进制或二进制转换为八进制
* 【问题描述】
    　　给定n个十六进制正整数，输出它们对应的八进制数。
  【输入格式】
　   　输入的第一行为一个正整数n （1<=n<=10）。
　　   接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。
  【输出格式】
　   　输出n行，每行为输入对应的八进制正整数。
　　【注意】
　　  输入的十六进制数不会有前导0，比如012A。
　　  输出的八进制数也不能有前导0。
  【样例输入】
　   　2
　　   39
　　   123ABC
  【样例输出】
　   　71
　　   4435274
* */
public class BASIC_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=1 && n<=10){
            //创建一个数组，用于存放结果
            int[] arr=new int[n];
            //对输入的每一个数进行操作
            for (int i = 0; i < n ; i++) {
                //从控制台获得16进制数组字符串
                String str = sc.next();
                //转换为16进制
                Integer hex = Integer.valueOf(str, 16);
                //再转换为八进制字符串
                String octalString = Integer.toOctalString(hex);
                //转为int类型
                int result = Integer.parseInt(octalString);
                //存入数组
                arr[i]=result;
            }

            //遍历数组输出
            for (int i = 0; i <arr.length ; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
