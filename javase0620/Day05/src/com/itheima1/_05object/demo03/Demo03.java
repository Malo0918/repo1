package com.itheima1._05object.demo03;
/*

    equals方法

 */
public class Demo03 {
    public static void main(String[] args) {

        Person p1 = null;
        Person p2 = new Person("张三", 23);

        // == 比较的是地址值
        System.out.println(p1 == p2);

        // equals方法
        System.out.println(p1.equals(p2));


    }
}
