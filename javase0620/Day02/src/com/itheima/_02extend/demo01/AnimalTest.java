package com.itheima._02extend.demo01;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setKind("柴犬");
        dog.setName("花花");
        dog.setAge(3);
        System.out.println(dog.toString());
        dog.eat();
        dog.sleep();

        Cat cat = new Cat("金毛","大熊",4);
        System.out.println(cat.toString());
        cat.eat();
        cat.sleep();


    }
}
