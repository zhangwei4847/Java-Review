package com.CSDN.Test1.保留小数位数;

/**
 * @author zw
 * @version 1.0
 */
public class Demo4 {
    public static void main(String[] args) {
        double x = 520.6666;
        String s = String.format("%.2f", x);
        System.out.println( s );
    }
}
