package com.atguigu.java.lanqiao;

import java.util.Scanner;

/*
* 试题D：最少刷题数
* */
public class Java_B_D {
    /*
    * D、小蓝老师教的编程课有N名学生，编号依次是1..N.第i号学生这学期刷题的数量是Ai。
    *    对于每一名学生，请你计算他至少还要再刷多少道题，才能使得全班刷题比他多的学生数不超过(≤)刷题比他少的学生数。
    * 输入格式：第一行包含一个正整数N。第二行包含N个整数：A1,A2,A3,...,AN。
    * 输出格式：输出N个整数，依次表示第1...N号学生分别至少还要再刷多少道题。
    * */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数N：");
        int n = sc.nextInt();
        int[] arr=new int[n];
        int[] moreStu=new int[n];
        int[] lessStu=new int[n];
        System.out.println("请输入N个整数：");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int more=0;
        int less=0;
        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length-i-1 ; j++) {
                if(arr[i]<arr[j]){
                    more++;
                    moreStu[index++]=arr[j];
                }else {
                    less++;
                    moreStu[index++]=arr[j];
                }
            }
        }

        do {
            for (int i = 0; i < index; i++) {

            }

        }while (more==less);


    }

}
