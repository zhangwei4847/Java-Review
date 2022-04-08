package com.runoob.Java_Number_Math_类;

/**TODO  Java equals方法
 * @author Zw
 * @version 1.0
 */
public class Equals {
    /**
     * equals() 方法用于判断 Number 对象与方法的参数进是否相等。
     * @param args
     */
    public static void main(String[] args) {
        Integer x = 5;
        Integer y = 10;
        Integer z = 5;
        Short a = 5;

        System.out.println(z.equals(y));
        System.out.println(x.equals(z));
        System.out.println(x.equals(a));
    }
}
