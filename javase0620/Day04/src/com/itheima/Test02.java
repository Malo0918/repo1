package com.itheima;
/*
    字符串的第一种遍历方式

        length() , charAt()
 */
public class Test02 {
    public static void main(String[] args) {
        String s = "我爱路路";
        char c ;
        for (int i = 0; i < s.length(); i++) {
           // char c = s.charAt(i);
             c = s.charAt(i);
            System.out.print(c);


        }
        
    }
}
