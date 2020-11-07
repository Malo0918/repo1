package com.itheima1._06date.demo02simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    常用的格式化和解析操作

 */
public class Demo02 {
    public static void main(String[] args) throws ParseException {

        // 创建Date对象, 代表当前时间
        Date d = new Date();

        // 创建SimpleDateFormat对象, 并执行模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        // 格式化
        String s = sdf.format(d);

        System.out.println(s);

        System.out.println("~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~");

        String str = "2008年8月8日 20:0:0";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        // 注意: 解析parse方法会出现一个异常(后面学)
        // 解决方案: 光标放在报错的地方, alt + enter -> enter
        Date date = sdf2.parse(str);

        System.out.println(date);
        System.out.println(d.getTime());

    }
}
