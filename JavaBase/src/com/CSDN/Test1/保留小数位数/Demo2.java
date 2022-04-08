package com.CSDN.Test1.保留小数位数;

/**
 * @author zw
 * @version 1.0
 */
public class Demo2 {
    public static void main(String[] args) {
        //定义两个值，区分`四舍五入`效果
        double num1 = 520.1111,num2 = 520.6666;
        //需要注意的是round() 方法返回一个 int、long 型值，所以需要强转成double类型
        num1 =(double) Math.round(num1 * 100) / 100;
        num2 =(double) Math.round(num2 * 100) / 100;

        System.out.println(num1 + " -- " +num2);
        // 控制台打印结果为：520.11 520.67   即`四舍五入`
    }
}
