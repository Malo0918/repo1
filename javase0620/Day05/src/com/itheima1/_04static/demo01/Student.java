package com.itheima1._04static.demo01;

public class Student {
    private String name;
    private int age;
    // 类变量
    public static String school = "黑马程序员";

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }

    public static void fun() {
        System.out.println("静态方法");
        System.out.println(school);
        // Non-static field 'name' cannot be referenced from a static context
        // System.out.println(name);
    }

}
