package com.itheima;



public class Test08 {
    public static void main(String[] args) {
        String s = reveseString("bjm");
        System.out.println(reveseString("bjm"));
        System.out.println(s);

    }
    public static String reveseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
