package com.itheima._Date;

import java.util.Date;

/*
构造方法
    Date（）：创建当前时间Date对象
    Datee（long 毫秒值）：

    成员方法
        getTime（）：表示1970 年 1 月 1 日 00:00:00 GMT 以后 time 毫秒的时间点
 */
public class Demo01 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        System.out.println(d.getTime());
    }
}
