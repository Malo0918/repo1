package com.itheima._demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
- public static Calendar getInstance() 获取当前日期的日历对象
- public int get(int field) 获取某个字段的值。
  - 参数field:表示获取哪个字段的值,可以使用Calender中定义的常量来表示
  - Calendar.YEAR : 年<br />Calendar.MONTH ：月<br />Calendar.DAY_OF_MONTH：月中的日期<br />Calendar.HOUR：小时<br />Calendar.MINUTE：分钟<br />Calendar.SECOND：秒<br />Calendar.DAY_OF_WEEK：星期
- public void set(int field,int value) 设置某个字段的值
- public void add(int field,int amount)为某个字段增加/减少指定的值
- 额外扩展2个方法:
  - void setTime(Date date)  使用给定的 Date 设置此 Calendar 的时间。
  - boolean before(Object when) 判断此 Calendar 表示的时间是否在指定 Object 表示的时间之前，返回判断结果。
    - 调用before方法的日历对象是否在参数时间对象之前,
      - 如果在之前就返回true     例如: 2017年11月11日   2019年12月18日   true
      - 如果不在之前就返回false  例如: 2019年12月18日    2017年11月11日  false
 */
public class CalendarTwest {
    public static void main(String[] args) throws ParseException {
        // 获取当前日期的日历对象
        Calendar nowCal = Calendar.getInstance();//2019年12月18日

        System.out.println(nowCal);
        System.out.println("----------");
        // 出生日期的日历对象
        String birtday = "2017年11月11日";
        // 创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(sdf);
        // 把String转换为Date
        Date birthdayDate = sdf.parse(birtday);
        // 把出生日期Date对象  转换为 Calendar日历对象
        Calendar birthdayCal = Calendar.getInstance();
        birthdayCal.setTime(birthdayDate);
        // 比较当前日历对象nowCal  与 出生日期日历对象 birthdayCal
        System.out.println(birthdayCal.before(nowCal));// true
        System.out.println(nowCal.before(birthdayCal));// false
        SimpleDateFormat sc1 = new SimpleDateFormat(birtday);

        System.out.println("----------");

    }
    private static void mefthod02() {
        Calendar cal1 = Calendar.getInstance();
        System.out.println(cal1);// 当前日期对应的日历对象
    }
}
