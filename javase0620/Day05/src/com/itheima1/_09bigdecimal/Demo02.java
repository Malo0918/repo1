package com.itheima1._09bigdecimal;

import java.math.BigDecimal;

/*
    BigDecimal

 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println(0.1 + 0.2);

        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");

        BigDecimal sum = bd1.add(bd2);

        System.out.println(sum);
    }
}
