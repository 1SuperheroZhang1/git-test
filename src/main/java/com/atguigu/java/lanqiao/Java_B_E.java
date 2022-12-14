package com.atguigu.java.lanqiao;

import java.util.Scanner;

/*
* 试题E：求阶乘
* */
public class Java_B_E {
    /*
    * E、满足N!的末尾恰好有K个0的最小的N是多少？
    *    如果这样的N不存在输出-1
    * 输入格式：一个整数K
    * 输出格式：一个整数代表答案。
    * 样例输入：2
    * 样例输出：10
    * 解题思路：暴力求解法
    *   后面以0结尾的一定是5!....(5的倍数的阶乘) 所以只需要判断5的倍数的阶乘
    *   (判断的数)/5 就是含有5的个数 也是阶乘后0的个数
    * */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long k = sc.nextLong();
        long count;
        long base=5;//直接从5的阶乘(120)开始判断
        while(true){
            long tmp=base;
            count=0;
            while(tmp>0){
                tmp /= 5;
                count += tmp;//记录5的个数
            }
            if(count < k){ //如果count<k，则N为5!的倍数
                base+=5;
            }else if (count == k){
                System.out.println(base);
                break;
            }else{
                System.out.println(-1);
                break;
            }
        }

    }


}
