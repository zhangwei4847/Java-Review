package com.Atguigu.Test;

/**
 * @author zw
 * @version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        int[][] arr = new int[][] {{1,2},{2,3},{3,4},{4,5},{5,6}};// 二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "、");
            }
        }
    }
}
