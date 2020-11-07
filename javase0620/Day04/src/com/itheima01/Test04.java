package com.itheima01;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        System.out.println(ress(new Scanner(System.in).nextLine()));
    }
    public static String ress(String s) {
        String se = "[";
        for (int i = s.length()-1; i >= 0; i--) {
            if (i == 0) {
                se+=s.charAt(i);
            }else {
                se += s.charAt(i) + ", ";
            }
        }

        return se+"]";
    }
}
