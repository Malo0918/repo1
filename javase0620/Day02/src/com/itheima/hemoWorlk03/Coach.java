package com.itheima.hemoWorlk03;
/*
教练类元 继承人员类
 */
public class Coach extends Person {


    @Override
    public void cat() {
        System.out.println("教练在吃工作餐");

    }
    public void show() {
        System.out.println("ID:"+getId()+", 名字: "+getName()+"，性别"+getGender()+", 年龄"+getAge());

    }



    public Coach(String id, String name, String gender, int age) {
        super(id, name, gender, age);
    }

    public Coach() {
    }
}
