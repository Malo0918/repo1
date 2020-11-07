package com.itheima._Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02 {
    public static void main(String[] args) {
        //创建Date对象，代表当前时间
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月");
        String s = sdf.format(date);
        System.out.println(s);

    }
}
