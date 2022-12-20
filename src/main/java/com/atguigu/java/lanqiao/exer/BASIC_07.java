package com.atguigu.java.lanqiao.exer;

/*
* 【问题描述】
    　　153是一个非常特殊的数，它等于它的每位数字的立方和(水仙花数)，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
  【输出格式】
    　　按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
* */
public class BASIC_07 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000 ; i++) {
            int bai=i/100;
            int shi=i%100/10;
            int ge=i%100%10;
            if(i==Math.pow(bai,3)+Math.pow(shi,3)+Math.pow(ge,3)){
                System.out.println(i);
            }
        }
    }
}
