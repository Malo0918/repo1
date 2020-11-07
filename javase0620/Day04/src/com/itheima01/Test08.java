package com.itheima01;

import java.util.Scanner;

/*

 */
public class Test08 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串： ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int a = 0;//小写
        int b= 0 ;//大写
        int c = 0;//数字
        int d = 0;//其他字符
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                a++;
            } else if (ch >= 'A' && ch <= 'Z') {
                b++;
            } else if (ch >= '0' && ch <= '9') {
                c++;
            } else {
                d++;
            }
        }
        System.out.println("大写字母："+b);
        System.out.println("小写字母："+a);
        System.out.println("数字："+c);
        System.out.println("其他字符： "+d);
    }
}
