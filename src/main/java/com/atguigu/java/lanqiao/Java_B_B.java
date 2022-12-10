package com.atguigu.java.lanqiao;

/*
 * B、这天小明正在学数数。他突然发现有些正整数的形状像一座“山”，比如123565321、145541，
 * 它们左右对称(回文)且数位上的数字先单调不减，后单调不增。小明数了很久也没有数完，他想让你告诉他
 * 在区间【2022，2022222022】中有多少个数的形状像一座“山”。
 * 解题思路：暴力求解法
 *      判断回文数，并且具有单调条件
 *      回文数左右对称，只需判断是否为回文数，然后再判断左边的数单调不减，则右边的数一定单调不增。
 * */
public class Java_B_B {

    static boolean check(int x){
        String a=String.valueOf(x);
        for (int i = 0; i <a.length()/2 ; i++) {
            if(a.charAt(i)!=a.charAt(a.length()-i-1)){//判断是否为左右对称(回文数)
                return false;
            }
        }
        for (int i = 1; i <(a.length()+1)/2 ; i++) {
            if(a.charAt(i)<a.charAt(i-1)){//确保数位上的数先单调不减，后单调不增
                return false;
            }
        }
        return true;
    }

    static void solve(){
        int answer=0;
        for (int i = 2022; i <=2022222022 ; i++) {
            if(check(i))
                answer++;
        }
        System.out.println(answer);//3138
    }
    public static void main(String[] args) {
        solve();
    }
}
