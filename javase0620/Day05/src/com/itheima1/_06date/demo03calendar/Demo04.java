package com.itheima1._06date.demo03calendar;

/*
    before

 */

import java.util.Calendar;

public class Demo04 {
    public static void main(String[] args) {

        Calendar c1 = Calendar.getInstance();

        Calendar c2 = Calendar.getInstance();
        // 修改成2020-6-28
        c2.set(2020, 5, 28);

        System.out.println(c1.before(c2)); // false
        System.out.println(c2.before(c1)); // true



    }
}
