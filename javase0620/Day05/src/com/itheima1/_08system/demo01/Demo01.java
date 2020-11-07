package com.itheima1._08system.demo01;

/*
    System:
        public static long currentTimeMillis() : 获取当前时间的毫秒值

 */
public class Demo01 {
    public static void main(String[] args) {
        // 1. 获取一段代码执行的时间


        /*long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            System.out.println(" ");
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);*/

        Loop l = new Loop();
        System.out.println(l.calcGap());

    }
}
