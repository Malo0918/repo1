package com.itheima.homeWorlk04;

public class Manager extends Member {
    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String id, String name, int age, double bonus) {
        super(id, name, age);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    private double bonus

            ;

    @Override
    public void setContent(String content) {
        System.out.println(content);
    }
    public void show() {
        System.out.println("工号： "+getId()+", 名字： "+getName()+"， 年龄： "+getAge()+"， 年终奖： "+getBonus()+"元");
    }
}
