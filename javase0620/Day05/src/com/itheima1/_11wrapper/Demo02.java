package com.itheima1._11wrapper;

import java.util.ArrayList;

/*

    jdk1.5版本的特性

    自动装箱
        自动将基本数据类型转换成对应的包装类

    自动拆箱
        自动将包装类转换成对应的基本数据类型

 */
public class Demo02 {
    public static void main(String[] args) {

        // 创建Integer
        Integer i1 = new Integer(10);

        Integer i2 = Integer.valueOf(10);

        // 当做基本数据类型使用
        int sum = i1.intValue() + 123;


        // 自动装箱
        Integer i3 = 100;
        // 自动拆箱
        int a = i3 + 10;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

    }
}
