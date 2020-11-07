package com.itheima1._03block.demo02;

// 类加载:  Xxx.class 加载进内存 , 只会执行一次
public class Person {

    static {
        System.out.println("静态代码块, 执行啦!~");
    }

    public Person() {
        System.out.println("构造方法执行啦!~");
    }
}
