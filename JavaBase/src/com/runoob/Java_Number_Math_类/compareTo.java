package com.runoob.Java_Number_Math_类;

/**TODO  Java compareTo方法
 * @author Zw
 * @version 1.0
 */
public class compareTo {
    /**
     * 如果指定的数与参数相等返回0。
     * 如果指定的数小于参数返回 -1。
     * 如果指定的数大于参数返回 1。
     * @param args
     */
    public static void main(String[] args) {
        Integer num = 5;
        System.out.println(num.compareTo(3));   //1
        System.out.println(num.compareTo(5));   //0
        System.out.println(num.compareTo(8));   //-1
    }
}
