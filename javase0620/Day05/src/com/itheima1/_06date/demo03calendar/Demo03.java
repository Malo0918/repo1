package com.itheima1._06date.demo03calendar;

import java.util.Calendar;
import java.util.Date;

public class Demo03 {
    public static void main(String[] args) {

        // 创建Calendar对象, 代表当前时间
        Calendar c = Calendar.getInstance();

        c.set(2000, 10, 20);

        // 1970-1-1
        /*Date d = new Date(0);

        c.setTime(d);

        System.out.println(c);*/

        Date time = c.getTime();

        System.out.println(time);

    }
}
