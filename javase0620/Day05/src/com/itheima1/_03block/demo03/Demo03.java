package com.itheima1._03block.demo03;

public class Demo03 {
    public static void main(String[] args) {

        System.out.println(1);


        {
            // 限定局部变量的声明周期(作用域)
            int a = 10;
            System.out.println(a);
            System.out.println("局部代码块");
        }
        System.out.println(2);
    }
}
