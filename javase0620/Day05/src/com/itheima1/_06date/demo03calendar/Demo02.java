package com.itheima1._06date.demo03calendar;

import java.util.Calendar;

/*

    Calendar的常用方法

 */
public class Demo02 {

    public static void main(String[] args) {

        // 创建对象
        Calendar c = Calendar.getInstance();

        // set: 修改指定字段的值
        // c.set(Calendar.YEAR, 2010);
        // c.set(2008, 7, 8, 20, 0, 0);

        // add : 对指定字段进行加减
        c.add(Calendar.YEAR, -10);


        // get: 获取指定字段的值
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);



        System.out.println("年: " + year);
        System.out.println("月: " + (month + 1));
        System.out.println("日: " + day);


    }

}
