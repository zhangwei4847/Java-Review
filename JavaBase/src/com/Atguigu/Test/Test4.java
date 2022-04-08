package com.Atguigu.Test;

import java.util.Arrays;

/**
 * @author zw
 * @version 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        int[][] arr = new int[][] {{1,2},{2,3},{3,4},{4,5},{5,6}};// 二维数组
        //使用Arrays.deepToString()
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.toString(arr));
    }
}
