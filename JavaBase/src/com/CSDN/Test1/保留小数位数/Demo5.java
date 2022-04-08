package com.CSDN.Test1.保留小数位数;

import java.math.BigDecimal;

/**
 * @author zw
 * @version 1.0
 */
public class Demo5 {
    public static void main(String[] args) {
        double num = 520.6666;
        BigDecimal bd = new BigDecimal(num);
        num = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(num);
    }
}
