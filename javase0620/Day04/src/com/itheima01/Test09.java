package com.itheima01;

public class Test09 {
    public static void main(String[] args) {


        System.out.println(symmetry("123321"));

    }
    public static boolean symmetry(String s) {


        StringBuilder sb = new StringBuilder(s);
        String reStr = sb.reverse().toString();
        return reStr.equals(s);


    }
}
