package com.atguigu.java.lanqiao;

import java.util.Arrays;
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
    * 解题思路：用数组接收每个学生的刷题数量，然后先对每个同学的刷题数进行从小到大排列，
    *          排列后观察发现，需要再刷题的学生只有前半部分学生，需要刷题的人数为n/2，
    *          而再刷的题目数量为中间同学的刷题量与该同学的刷题量的差值。
    *          然后用左右与中间值相同数量求出差值即可。
    * */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数N：");//5
        int n = sc.nextInt();
        int[] arr=new int[n];//用于接收每个学生的刷题数量
        int[] arrcopy=new int[n];
        System.out.println("请输入N个整数：");//12 10 15 20 6
        for (int i = 0; i <arr.length ; i++) {
            int tmp=sc.nextInt();
            arr[i]=tmp;
            arrcopy[i]=tmp;
        }
        //对arr数组进行排序 -err
//        int tmp=0;
//        for (int i = 0; i <arrcopy.length ; i++) {
//            for (int j = i+1; j <arrcopy.length-i-1 ; j++) {
//                if(arrcopy[j]>arrcopy[j+1]){
//                    tmp=arrcopy[j];
//                    arrcopy[j]=arrcopy[j+1];
//                    arrcopy[j+1]=tmp;
//                }
//            }
//        }
        //排序
        Arrays.sort(arrcopy);
        for (int i = 0; i < n; i++) {
            //在arrcopy中查找arr[i]的位置
            int pos = Arrays.binarySearch(arrcopy, arr[i]);
            //计算i左边的数(即就是刷题数量比i学生少的人数)
            int less=pos;
            //计算i右边的数(即就是刷题数量比i学生多的人数)
            int more=n-pos-1;
            if(more>less){//刷题多的 > 刷题少的
                int d=more-less;
                int need=arrcopy[pos+d/2]-arrcopy[pos]+1;//需要再刷的题目数量为中间同学的刷题量与该同学的刷题量的差值
                System.out.print(need +" ");
            }else{
                System.out.print(0 + " ");
            }//0 3 0 0 7

        }





    }

}
