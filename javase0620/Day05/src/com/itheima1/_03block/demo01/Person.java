package com.itheima1._03block.demo01;

public class Person {

    private String name;

    // 构造代码块
    {
        this.name = "张三";
        System.out.println("构造代码块, 执行啦!~");
    }

    public Person() {
        System.out.println("无参构造");
    }

    public Person(String name) {
    }
}
