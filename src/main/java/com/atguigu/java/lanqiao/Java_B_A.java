package com.atguigu.java.lanqiao;

import org.junit.Test;

/**
 * 第十三届蓝桥杯省赛 - Java 大学B组
 * */
public class Java_B_A {
    //A.已知今天是星期六，请问20^22天后是星期几？ 注意：用数字1到7表示星期一到星期日
    public static void main(String[] args) {
        int index=6;
        int result= (int) ((index+Math.pow(20,22))%7);
        System.out.println(result);//周一
    }
}
