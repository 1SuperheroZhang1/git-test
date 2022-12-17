package com.atguigu.java.lanqiao.exer;

/*
* BASIC-02.字串
* */
public class BASIC_02 {
    /*
    * 【问题描述】对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
                    00000
                    00001
                    00010
                    00011
                    00100
         请按从小到大的顺序输出这32种01串。
    * 【输入格式】本试题没有输入。
      【输出格式】输出32行，按从小到大的顺序每行一个长度为5的01串。
    * */
    public static void main(String[] args) {
        int total= (int) Math.pow(2,5);//长度为5的字串共有2^5种情况。
        for (int i = 0; i < total; i++) { //0-31
            int index=0; //用来指示ret数组中的元素下标
            int ret[]=new int[5];
            int temp=i;//temp用于暂存0-31共32个数
            while (temp!=0){//将0-31这三个十进制数转换为二进制数
                //十进制数转换为二进制数的方法：不断的对十进制数进行除2，直到余数为0为止。将余数写在右边，逆向读余数。
                ret[index]=temp%2;
                temp/=2;
                index++;
            }

            for (int j = 4; j >= 0; j--) { //逆向读取余数
                System.out.print(ret[j]);
            }

            if(i!=total-1){
                System.out.println();
            }
        }
    }
}
