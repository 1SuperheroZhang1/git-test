package com.atguigu.java.utils;

/**
 * 自定义数组的工具类
 * 1. 求数组的最大值
 * 2. 求数组的最小值
 * 3. 求数组的总和
 * 4. 求数组的平均值
 * 5. 反转数组
 * 6. 复制数组
 * 7. 排序数组
 * 8. 遍历数组
 * 9. 查找数组指定元素
 * 10.交换两个指定元素的值
 * */
public class ArrayUtils {
    //1.求数组的最大值
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    //2.求数组的最小值
    public static int getMin(int[] arr){
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    //3.求数组的总和
    public static int getSum(int[] arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    //4.求数组的平均值
    public static int getAvg(int[] arr){
        int sum=0;
        int avg=0;
        int sz=arr.length;
        for (int i = 0; i <sz ; i++) {
            sum+=arr[i];
        }
        avg=sum/sz;
        return avg;
    }

    //5.反转数组
    public static void reverse(int[] arr){
        int tmp=0;
        for (int i = 0; i < arr.length /2 ; i++) {
            tmp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-1-i]=tmp;
        }
    }

//    public void reverse(int[] arr){
//        int tmp=0;
//        for (int i = 0,j=arr.length-1;i<j;i++,j--){
//            tmp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=tmp;
//        }
//    }

    //6.复制数组
    public static int[] copy(int[] arr){
        int[] newarr=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            newarr[i]=arr[i];
        }
        return newarr;
    }

    //7.排序数组
    public static void bubbleSort(int[] arr){
        int tmp=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }

    //8.遍历数组
    public static void print(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //9.查找数组指定元素
    public static int searchElementByIndex(int[] arr,int value){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==value){
                return i;
            }
        }
        return -1;//返回负数表示没有找到
    }

    //10.交换两个指定元素的值
    public static void swap(int[] arr,int x,int y){
        int tmp=arr[x];
        arr[x]=arr[y];
        arr[y]=tmp;
    }
}
