package com.itheima._01review.demo01;

public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("丽丽");
        stu.setAge(18);
        System.out.println("姓名： "+stu.getName()+", "+ stu.getAge());
        Student stu2 = new Student("路路",19);
        System.out.println("姓名: " + stu2.getName() + ", 年龄: " + stu2.getAge());

    }
}
