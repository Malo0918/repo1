package com.itheima1._08system.demo02;
/*

    public static void exit(int status)
                    : 结束Java虚拟机

 */
public class Demo02 {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            if (i == 10) {
                System.exit(0);
                // break;
            }

            System.out.println(i);
        }

        System.out.println("循环后的代码");


    }
}
