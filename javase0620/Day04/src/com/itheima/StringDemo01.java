package com.itheima;

public class StringDemo01 {
    public static void main(String[] args) {
        //public String():创建一个空白字符串对象，不含任何内容
        String s1 = new String ();
        System.out.println("s1: "+s1);//空什么都不显示

        //public String(char[] chs);根据字符数组的内容，来创建字符串对象
        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println("s2: "+s2);//abc
        System.out.println(new String(chs));//abc

        //public String _byte[]bys);根据字节数组的内容，创建字符串对象
        byte[] bys = {97,98,99};
        String s3 = new String(bys);
        System.out.println("s3: "+s3);//abc
        System.out.println(new String(bys));//abc

        //String s = "abc";直接赋值的方式创建字符串对象，内容就是abd
        String s4 = "abc";
        System.out.println("s4: "+s4);


    }
}
