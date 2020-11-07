package com.itheima;
/*
        字符串遍历的第二种方式

        public char[] toCharArray() : 获取字符串对应的 字符数组

        *toCharArray


        */
public class Test03 {
    public static void main(String[] args) {
        String s = "我爱路路";
        //将字符串转成字符数组
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            System.out.print(c);
        }
    }
}
