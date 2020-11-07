package com.itheima._demo01;

import java.util.Calendar;
import java.util.Date;

public class Demo03 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        c.set(2000,10,20);
        Date d =new Date(0);

        c.setTime(d);
        Date time = c.getTime();

        System.out.println(time);
        System.out.println("-------------------");

        System.out.println(c);

    }

}
