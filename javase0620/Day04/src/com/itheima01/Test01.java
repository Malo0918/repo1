package com.itheima01;

import com.itheima.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            //既有获取字符串，又有获取数字
            //具体场景；先获取数字，再用nextLine方法获取字符串
            System.out.println("请输入第"+(i+1)+"个人的姓名：");
            String name =sc.next();
            System.out.println("请输入第"+(i+1)+"个人的年龄：");
            int age =sc.nextInt();
            list.add(new Person(name,age));//==/* Person A = new Person(name,age);list.add(A);*/

        }
        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            System.out.println(p.getName()+"--------"+p.getAge());
        }


    }
}
