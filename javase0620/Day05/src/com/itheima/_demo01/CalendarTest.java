package com.itheima._demo01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR,2010);
        c.set(2018,9,18);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);


        int month = c.get(Calendar.MONTH)+1;
        System.out.println(month);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        Date d = new Date();
        d.getTime();
        System.out.println(d.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat();




    }
}
