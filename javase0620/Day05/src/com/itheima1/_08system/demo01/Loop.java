package com.itheima1._08system.demo01;

public class Loop extends CalcTime {
    @Override
    public void operator() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("**********");
        }
    }
}
