package com.atguigu.java.lanqiao;

import java.util.Iterator;
import java.util.Scanner;

/*
* 试题C：字符统计
* */
public class Java_B_C {
    /*
    * C、给定一个只包含大写字母的字符串S，请你输出其中出现次数最多的字母。
    *    如果有多个字母均出现了最多次，按字母表顺序依次输出所有这些字母。
    * 暴力求解法：直接统计输出。
    *       测试输入：BABBACAC
    *       测试输出：AB
    * */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str = scanner.next();//测试输入：BABBACAC
        int arr[]=new int[26];
        for (int i = 0; i <str.length(); i++) {
            char c = str.charAt(i);
            arr[c-'A']++;
        }
        int maxValue=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            maxValue= Math.max(maxValue, arr[i]);
        }

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==maxValue)
                System.out.print((char)(i+'A'));//测试输出：AB

        }

    }
}
