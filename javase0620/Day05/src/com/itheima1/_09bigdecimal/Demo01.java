package com.itheima1._09bigdecimal;

import java.math.BigInteger;

/*

    BigInteger
        构造方法
            BigInteger(String s)

        成员方法
            add(BigInteger)
 */
public class Demo01 {

    public static void main(String[] args) {

        // long l = 12345678901234567890L;

        BigInteger bi1 = new BigInteger("100000000000");

        BigInteger bi2 = new BigInteger("999999999");

        // 相加运算
        BigInteger sum = bi1.add(bi2);

        System.out.println(sum);


    }

}
