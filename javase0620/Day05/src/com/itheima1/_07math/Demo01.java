package com.itheima1._07math;
/*
    Math的使用

 */
public class Demo01 {
    public static void main(String[] args) {

        int age1 = 10;
        int age2 = 20;
        // 绝对值
        System.out.println(Math.abs(age1 - age2));

        // pow: n的m次方
        // 参数和返回都是double类型
        System.out.println(Math.pow(10, 3));

        // round : 四舍五入
        System.out.println(Math.round(12.4));
        System.out.println(Math.round(12.5));
        // 四舍五入 :  (int)(数字 + 0.5)
        System.out.println((int) (13.4 + 0.5)); // 期望: 13
        System.out.println((int) (13.5 + 0.5)); // 期望: 14





    }
}
