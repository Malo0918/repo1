package com.itheima._03abstract;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
    public void eat() {
        System.out.println("学生要好好吃饭, 学习需要有好的营养!~");
    }

    public void sleep() {
        System.out.println("学生更好好好睡觉, 睡饱了才有精力学习!~");
    }
}
