package com.itheima._03abstract;

public class Teacher extends Person {
    public Teacher(String name, int age) {

        super(name, age);
    }

    public Teacher() {
    }

    public void eat() {
        System.out.println("老师不能吃饭, 要减肥");
    }

    public void sleep() {
        System.out.println("老师也得好好睡觉!~");
    }
}

