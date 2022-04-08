package com.runoob.Demo1;

import java.io.Serializable;

/**
 * @Author zw
 * @Version 1.0
 */
public class Dog implements Serializable {
    private String name;
    public int age;

    public Dog() {
        System.out.println("Dog真可爱");
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
