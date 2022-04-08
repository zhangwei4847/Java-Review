package com.CSDN.Test1.保留小数位数;

import java.text.NumberFormat;

/**
 * @author zw
 * @version 1.0
 */
public class Demo6 {
    public static void main(String[] args) {
        double num = 520.4444;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2); // 不足两位不补0，超过两位部分的自动舍去
        //nf.setMinimumFractionDigits(2); 不足两位自动补0，超过两位的部分不舍去
        System.out.println(nf.format(num));
    }
}
