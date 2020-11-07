package com.itheima._02extend.demo01;

public  class Animal {
    private String name;
    private String kind;
    private int age;

    public Animal(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat () {
        System.out.println("动物吃饭");
    }
    public void sleep() {
        System.out.println("动物睡觉");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", age=" + age +
                '}';
    }
}
