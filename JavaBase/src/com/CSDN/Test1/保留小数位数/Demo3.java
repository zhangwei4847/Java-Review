package com.CSDN.Test1.保留小数位数;

import java.text.DecimalFormat;   //注意导包

/**
 * @author zw
 * @version 1.0
 */
public class Demo3 {
    public static void main(String[] args) {
        double num = 520.1314;
        DecimalFormat df = new DecimalFormat("0.00");
        String format = df.format(num);
        System.out.println(format);
    }
}
