package com.atguigu.java.lanqiao.exer;

/*
* 【问题描述】
　　  1221是一个非常特殊的数，它从左边读和从右边读是一样的(对称数)，编程求所有这样的四位十进制数。
  【输出格式】
　　  按从小到大的顺序输出满足条件的四位十进制数。
* */
public class BASIC_08 {

    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                for (int k = 0; k <10 ; k++) {
                    for (int l = 0; l <10 ; l++) {
                        if(i == l && j == k){
                            System.out.println("" + i + j + k + l);
                        }
                    }
                }
            }
        }
    }
}
