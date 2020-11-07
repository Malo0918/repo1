package com.itheima.hemoWorlk03;

public class PersonTest {
    public static void main(String[] args) {
        Coach c = new Coach("001","张三","男",8);

        c.show();
        c.cat();
        System.out.println("---------------");
        Athletes als = new Athletes("001", "韩阔", "男", 20,"3.2");
        c.cat();
    }
}
