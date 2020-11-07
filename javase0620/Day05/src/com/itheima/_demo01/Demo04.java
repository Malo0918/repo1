package com.itheima._demo01;

import java.util.Calendar;

/*
before
 */
public class Demo04 {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();

        Calendar c2 = Calendar.getInstance();
        //修改成2020-6-28
        c2.set(2020,5,28);

        c2.add(Calendar.YEAR,5);
        System.out.println(c2.getTime());

        System.out.println(c1.equals(c2));//false
        System.out.println(c2.equals(c1));
    }
}
