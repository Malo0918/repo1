package com.itheima.hemoWorlk03;
/*
运动员  继承人员类
 */
public class Athletes extends Person {
    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Athletes(String id, String name, String gender, int age, String className) {
        super(id, name, gender, age);
        this.className = className;
    }

    public Athletes(String className) {
        this.className = className;
    }

    @Override
    public void cat() {
        System.out.println("运动员吃营养餐");
    }
}
