package com.itheima.homeWorlk02;

public class Reptile extends zoology {
    @Override
    public void move() {
        System.out.println("爬行动物都在地表爬行...");
    }
    public void ectotherm() {
        System.out.println("爬行动物没有体温调节能力...");
    }
}
