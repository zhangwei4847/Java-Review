package com.runoob.Demo1;

/**
 * @Author zw
 * @Version 1.0
 */
public class Test {
    public void pupAge(){
        int age = 1;
        age = age + 7;
        System.out.println("小狗的年龄是 : " + age);
    }

    public static void main(String[] args){
        Test test = new Test();
        test.pupAge();
    }
}
