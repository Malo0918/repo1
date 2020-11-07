package com.itheima01;

import java.util.ArrayList;

public class Test06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
            System.out.println(list.get(i));



        }

    }

}
