package com.Atguigu.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**IDEA常用模板
 * @author zw
 * @version 1.0
 */
public class Test1 {

    //模板1：psvm
    public static void main(String[] args) {
        //模板2:sout
        System.out.println("Hello!");
        //模板2变性: soutp / soutm /soutv / xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Test1.main");
        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);
        //模板3:fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //变性：iter(for)  -- 增强for循环
        for (String s : arr) {
            System.out.println("s = " + s);
        }
        //变性：itar(fori)   -- 普通for循环
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("s = " + s);
        }
        method(10);

        //模板4：lis.for
        ArrayList<String> list = new ArrayList<>();
        list.add("传智");
        list.add("专修");
        list.add("学院");
        System.out.println(list);

        //模板5：ifn
        if (list == null) {

        }
        //变形:inn
        if (list != null) {

        }
        //变形: xxx.nn  / xxx.null
        if (list == null) {

        }
        if (list != null) {

        }

    }

    public static void method(int count){
        System.out.println("count = " + count);
        System.out.println("Test1.method");
    }
}
