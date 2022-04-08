package com.runoob.Java_Number_Math_类;

/**TODO Java xxxValue() 方法
 * @author Zw
 * @version 1.0
 */
public class xxxValue {

    /**
     * xxxValue() 方法用于将 Number 对象转换为 xxx 数据类型的值并返回。
     * @param args
     */
    public static void main(String[] args) {
        Integer num = 5;
        //返回byte原生数据类型
        System.out.println(num.byteValue());
        //返回double原生数据类型
        System.out.println(num.doubleValue());
        //返回long原生数据类型
        System.out.println(num.longValue());

    }
}
