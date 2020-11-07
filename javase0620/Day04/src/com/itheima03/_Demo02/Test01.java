package com.itheima03._Demo02;

import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
            demo01();

            demo02();
            demo03();
    }
    public static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
    public static void demo02() {
        Date date = new Date(0L);
        System.out.println(date);//Thu Jan 01 08:00:00 CST 1970

        date = new Date(3742767540069L);
        System.out.println(date);
        date = new Date(1593335903799L);
        System.out.println(date);

    }
    public static void demo01() {
        Date date = new Date();
        System.out.println(date);//Sun Jun 28 17:12:15 CST 2020
    }
}
