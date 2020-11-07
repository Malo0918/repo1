package com.itheima._01review.demo02;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
        p1.sleep();
        System.out.println("-.---------");
        new Person().eat();
        new Person().sleep();
    }
}
