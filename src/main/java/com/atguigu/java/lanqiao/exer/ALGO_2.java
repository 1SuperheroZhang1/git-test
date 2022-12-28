package com.atguigu.java.lanqiao.exer;

import java.util.Scanner;

/*
* 【问题描述】
       已知一个正整数N，问从1~N中任选出三个数，他们的最小公倍数最大可以为多少。
  【输入格式】
       输入一个正整数N。
  【输出格式】
       输出一个整数，表示你找到的最小公倍数。
  【样例输入】
       9
  【样例输出】
       504
   思路：
（1）n 小于等于 2 ，最大公倍数即为n本身；
（2）n 大于 2：
① n 为奇数 ： n, n-1, n-2三个数互为质数，结果为三个数的乘积；
② n 为偶数：
<1> n, n-2 有公约数2，故结果应比n, n-1, n-2的最小公倍数大，因此可将 n-2 替换为 n - 3 ，结果 为 n, n-1, n-3 的乘积（当n不是三的倍数时成立）;
<2> 若n为三的倍数，n 与 n-3有公约数3，因此再将n-3 替换为 n- 4 ,此时出现 <1> 的情况，再 将 n-4 替换为n-5,而n*(n-1)(n-5) < (n-1)(n-2)(n-3) (当n大于1时成立),故结果为(n-1)(n-2)*(n-3)。
* */
public class ALGO_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n = sc.nextInt();
        if(n<=2){
            System.out.println(n);
        }else{
            if(n%2!=0){
                System.out.println(n*(n-1)*(n-2));
            }else{
                if(n%3!=0){
                    System.out.println(n*(n-1)*(n-3));
                }else{
                    System.out.println((n-1)*(n-2)*(n-3));
                }
            }
        }
    }
}
