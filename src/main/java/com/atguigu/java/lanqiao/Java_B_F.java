package com.atguigu.java.lanqiao;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
* 试题F：最大子矩阵
* */
public class Java_B_F {
    /*
    * 【问题描述】：小明有一个大小为N×M的矩阵，可以理解为一个N行M列的二维数组。
    *  我们定义一个矩阵m的稳定度f(m)=max(m)-min(m)，其中max(m)表示矩阵m中的最大值，min(m)表示矩阵m中的最小值。
    *  现在小明想要从这个矩阵中找到一个稳定度不大于limit的子矩阵，同时他还希望这个子矩阵的面积越大越好(面积可以理解为矩阵中元素的个数)。
    *  子矩阵定义如下：从原矩阵中选择一组连续的行和一组连续的列，这些行列交点上的元素组成的矩阵即为一个子矩阵。
    * 【输入格式】：
    *       第一行输入两个整数N，M，表示矩阵的大小
    *       接下来N行，每行输入M个整数，表示这个矩阵。
    *       最后一行输入一个整数limit，表示限制。
    * 【输出格式】：
    *       输出一个整数，分别表示小明选择的子矩阵的最大面积。
    * 【样例输入】：
    *   3 4
    *   2 0 7 9
    *   0 6 9 7
    *   8 4 6 4
    *   8
    * 【样例输出】：
    *   6
    * */
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个整数n和m：");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("请输入数组中的每个元素：");
        arr=new int[n][m];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("请输入一个整数limit表示限制：");
        int limit = sc.nextInt();
        int maxSquare=Integer.MIN_VALUE;
        for (int i = n; i > 0 ; i--) {
            for (int j = m; j > 0 ; j--) { //i*j的矩阵
                for (int k = 0; k < n-i ; k++) {
                    for (int l = 0; l < m-j; l++) { //左上角坐标
                        int max=getMax(i,j,k,l);
                        int min=getMin(i,j,k,l);
                        if((max-min)<=limit){
                            maxSquare=Math.max(maxSquare,i*j);
                        }
                    }
                }
            }
        }
        System.out.println(maxSquare);
    }

    private static int getMax(int i,int j,int x,int y){
        int max=Integer.MIN_VALUE;
        for (int p = x; i < x+i ; i++) {
            for (int q = y; j < y+j ; j++) {
                max=Math.max(max,arr[p][q]);
            }
        }
        return max;
    }

    private static int getMin(int i,int j,int x,int y){
        int min=Integer.MAX_VALUE;
        for (int p = x; i < x+i ; i++) {
            for (int q = y; j < y+j ; j++) {
                min=Math.min(min,arr[p][q]);
            }
        }
        return min;
    }
}
