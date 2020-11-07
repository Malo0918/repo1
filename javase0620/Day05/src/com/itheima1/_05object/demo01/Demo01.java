package com.itheima1._05object.demo01;
/*

    Object中的方法

 */
public class Demo01 {
    public static void main(String[] args) {

        Person p = new Person();

        System.out.println(p.getClass().getName());

        System.out.println(p.hashCode());
        System.out.println(Integer.toHexString(p.hashCode()));

        System.out.println(p.toString());

        int[] arr = {1, 2, 3};
        System.out.println(arr.toString());

    }
}
