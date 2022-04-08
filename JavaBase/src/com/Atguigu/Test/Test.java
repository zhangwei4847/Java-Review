package com.Atguigu.Test;

/**
 * @author zw
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
        // 普通for循环打印
        System.out.println("普通for循环打印:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "、");
        }
        System.out.println(); // 换行
        // 增强for循环打印
        System.out.println("增强for循环打印:");
        for (int num : arr) {
            System.out.print(num + "、");
        }
    }
}
