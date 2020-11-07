package com.itheima;

import java.util.Scanner;

/*

    键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)

        键盘录入, 获取字符串
        需要获取每一个字符 -> 遍历
        要做判断!怎么判断?
        计数器

 */
public class Test04 {
    public static void main(String[] args) {

        System.out.println("请输入字符串");
        cesi(new Scanner(System.in).nextLine());
        //Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();
    }
    public static void cesi(String s) {
        // 在循环外定义计数器
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char r = s.charAt(i);


            if (r >= 'a' && r <= 'z') {
                smallCount++;
            } else if (r >= 'A' && r <= 'Z') {
                bigCount++;
            } else if (r >= '1' && r <= '9') {
                numberCount++;
            }
        }
        System.out.println("大写字符个数: " + bigCount);
        System.out.println("小写字符个数: " + smallCount);
        System.out.println("数字字符个数: " + numberCount);
    }
}
