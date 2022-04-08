package com.runoob.Java_Number_Math_类;

/**TODO Java toString方法
 * @author Zw
 * @version 1.0
 */
public class toString {

    /**
     * toString() 方法用于返回以一个字符串表示的 Number 对象值。
     * 如果方法使用了原生的数据类型作为参数，返回原生数据类型的 String 对象值。
     * 如果方法有两个参数， 返回用第二个参数指定基数表示的第一个参数的字符串表示形式。
     * @param args
     */
    public static void main(String[] args) {
        Integer x =5;

        System.out.println(x.toString());
        System.out.println(Integer.toString(12));
    }
}
