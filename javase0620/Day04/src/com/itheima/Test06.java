package com.itheima;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        System.out.println(reverse(new Scanner(System.in).nextLine()));

    }
    public static String reverse(String s ) {
        String result="" ;

        for (int i = s.length()-1; i >= 0; i--) {
            result+= s.charAt(i);
        }
        return result;
    }
}
