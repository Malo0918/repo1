package com.itheima1._08system.demo01;

public abstract class CalcTime {

    public abstract void operator();

    public long calcGap() {
            long start = System.currentTimeMillis();

        operator();

        long end = System.currentTimeMillis();

        return end - start;
    }

}
