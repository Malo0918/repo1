package com.itheima02;

public class Ui extends Person implements drawing {
    @Override
    public void wolk() {
        System.out.println("ui讲师正在上课");
    }

    @Override
    public void drawing() {
        System.out.println("ui讲师会绘画");
    }
}
