package com.itheima._Date;

import java.util.Calendar;

public class Demo04 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        //set：修改指定字段的值
        c.set(2000,8,18);


        //get:获取指定字段的值
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.print("年："+year);
        System.out.print("月："+(month+1));
        System.out.print("日："+day);


    }
}
