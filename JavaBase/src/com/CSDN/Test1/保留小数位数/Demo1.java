package com.CSDN.Test1.保留小数位数;

/**
 * @author zw
 * @version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        String Chinese = "23230.048";
        double chinese = Double.parseDouble(Chinese);
        chinese = (double) Math.round(chinese * 100) / 100;
        System.out.println(chinese);
        double x = 8.055;
        System.out.printf("%.2f\n",x);//8.06
    }
}
