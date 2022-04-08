package com.runoob.Demo1;

/**
 * @Author zw
 * @Version 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        //换行
        System.out.println("Hello\nWorld1");
        //回车
        System.out.println("Hello\rWorld2");
        //制表
        System.out.println("Hello\tWorld3");
        //退格
        System.out.println("Hello\b\bWorld3");

        int i =128;
        byte b = (byte)i;
        System.out.println(b);
    }
}
