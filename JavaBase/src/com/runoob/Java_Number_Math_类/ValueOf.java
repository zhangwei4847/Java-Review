package com.runoob.Java_Number_Math_类;

/**TODO Java valueOf方法
 * @author Zw
 * @version 1.0
 */
public class ValueOf {

    /**
     * valueOf() 方法用于返回给定参数的原生 Number 对象值，参数可以是原生数据类型, String等。
     * 该方法是静态方法。该方法可以接收两个参数一个是字符串，一个是基数。
     * @param args
     */
    public static void main(String[] args) {

        System.out.println( Integer.valueOf(9) );
        System.out.println( Double.valueOf(50) );
        System.out.println( Float.valueOf("80") );
        System.out.println( Integer.valueOf("444",16) ); //使用16进制
    }
}
