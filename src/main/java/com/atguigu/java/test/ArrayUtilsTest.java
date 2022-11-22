package com.atguigu.java.test;

import com.atguigu.java.utils.ArrayUtils;
import org.junit.Test;

public class ArrayUtilsTest {
    @Test
    public void test(){
        int[] arr=new int[] {1,5,4,98,3,7,8,9};

        //求数组的最大值
        int max = ArrayUtils.getMax(arr);
        System.out.println(max);//98
        //求数组的最小值
        int min = ArrayUtils.getMin(arr);
        System.out.println(min);//1
        //求数组的总和
        int sum = ArrayUtils.getSum(arr);
        System.out.println(sum);//135
        //求数组的平均值
        int avg = ArrayUtils.getAvg(arr);
        System.out.println(avg);//16
        //反转数组
//        System.out.println("反转前：");
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        ArrayUtils.reverse(arr);
//        System.out.println();
//        System.out.println("反转后：");
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }

         //复制数组
//        int[] copyArr = ArrayUtils.copy(arr);
//        for (int i = 0; i <copyArr.length ; i++) {
//            System.out.print(copyArr[i]+" ");
//        }
//        System.out.println();

        //排序数组
//        System.out.println("排序前：");
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        System.out.println("排序后：");
//        ArrayUtils.bubbleSort(arr);
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();

        //遍历数组
//        ArrayUtils.print(arr);

        //查找数组指定元素
//        int index = ArrayUtils.searchElementByIndex(arr, 98);
//        System.out.println(index);//3

        //交换两个指定元素的值
        ArrayUtils.print(arr);
        ArrayUtils.swap(arr,2,4);
        ArrayUtils.print(arr);


    }
}
