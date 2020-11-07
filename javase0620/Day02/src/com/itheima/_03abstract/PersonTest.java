package com.itheima._03abstract;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class PersonTest {
    public static void main(String[] args) {
        Student stu = new Student("丽丽",20);


        System.out.println(stu.getName()+"--------"+stu.getAge());
        stu.eat();
        stu.sleep();

        Teacher t = new Teacher("阿伟",20);
        System.out.println(t.getName()+"--------"+t.getAge());
        t.eat();
        t.sleep();

    }
}
