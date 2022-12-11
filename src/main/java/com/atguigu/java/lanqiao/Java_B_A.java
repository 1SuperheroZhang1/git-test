package com.atguigu.java.lanqiao;

import org.junit.Test;

/**
 * 第十三届蓝桥杯省赛 - Java 大学B组
 * 试题A：星期计算
 * */
public class Java_B_A {
    //A.已知今天是星期六，请问20^22天后是星期几？ 注意：用数字1到7表示星期一到星期日
    /*
    * 解题思路：暴力求解法
    *  直接利用计算机计算20^22，再对此数进行取余(7)，结果为1.
    * */
    public static void main(String[] args) {
        int index=6;
        int result= (int) (index+Math.pow(20,22)%7);
        System.out.println(result);//7 - 周日
    }
}
