package com.itheima03._Demo01;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("[");
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");
        list.add("]");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (i != list.size()-2 &&i!=0) {
                System.out.print(s + ", ");
            } else {
                System.out.print(s);
            }
        }
    }
}
