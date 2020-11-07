package com.itheima01;

public class Test02 {
    public static void main(String[] args) {
        //String s = reveseString("bjm");
        //System.out.println(s);
        System.out.println(reveseString("123"));
    }
    public static String reveseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
