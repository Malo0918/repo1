package com.itheima;

import java.util.Scanner;

/*
    已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，
    登录之后，给出相应的提示



 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "2000";
        String password = "123";
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "个账号:");
            String myUsername = sc.next();
            System.out.println("请输入第一个密码:");
            String myPassword = sc.next();

            if (username.equals(myUsername) && password.equals(myPassword)) {
                System.out.println("输入正确");
                return;
            } else {
                System.out.println("输入错误");
                System.out.println("还有" + (2 - i) + "次机会");
            }
            if (i == 2) {
                System.out.println("结束");
                return;
            }


        }
    }
}