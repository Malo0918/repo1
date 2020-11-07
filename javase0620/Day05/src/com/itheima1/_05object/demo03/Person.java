package com.itheima1._05object.demo03;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // p1.equals(p2);
    @Override
    public boolean equals(Object o) {
        // 判断地址值是否相同, 如果地址值相同就是同一个对象, 不需要比较
        if (this == o) {
            return true;
        }

        // 方法能执行, 说明调用equals的对象一定不为null
        // 如果传入的参数是null, 就直接返回false
        if (o == null ) {
            return false;
        }

        // 字节码文件是唯一的
        // 如果两个对象的类型不同, 直接返回false
        if (this.getClass() != o.getClass()) {
            return false;
        }

        // 向下转型
        Person person = (Person) o;

        // 比较姓名和年龄(属性)
        return age == person.age &&
                Objects.equals(this.name, person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
