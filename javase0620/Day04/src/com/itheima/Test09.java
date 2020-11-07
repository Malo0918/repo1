package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+"个人的姓名：");
            String name = sc.next();
            System.out.println("请输入第"+(i+1)+"个人的年龄：");
            int age = sc.nextInt();
            list.add(new Person(name,age));
        }
        for (int i = 0; i < list.size(); i++) {
            Person p = list .get(i);
            System.out.println(p.getName()+"--------"+p.getAge());
        }
    }
}
