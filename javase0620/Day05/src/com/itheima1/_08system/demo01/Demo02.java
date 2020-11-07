package com.itheima1._08system.demo01;

public class Demo02 {
    public static void main(String[] args) {

        // 在循环的外面, 定义一个变量, 用来代表上一次发射子弹的时间
        long shootTime = 0L;

        while (true) {
            // 现在要发射子弹了~
            // 先进行判断 : 当前时间和上一次发射子弹的时间间隔是否大于 3秒
            long current = System.currentTimeMillis();
            if (current - shootTime > 1000) {
                System.out.println("发射子弹");
                // 记录当前时间
                shootTime = current;
            }
        }

    }
}
