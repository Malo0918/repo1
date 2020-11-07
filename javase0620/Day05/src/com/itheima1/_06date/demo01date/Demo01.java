package com.itheima1._06date.demo01date;

import java.util.Date;

/*

    Date类: 里面的内容大部分已经过时了

        构造方法
            Date() : 创建代表当前时间的Date对象
            Date(long 毫秒值) :

        成员方法
            getTime() : 表示 1970 年 1 月 1 日 00:00:00 GMT 以后 time 毫秒的时间点

 */
public class Demo01 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        System.out.println(d.getTime());

    }
}
