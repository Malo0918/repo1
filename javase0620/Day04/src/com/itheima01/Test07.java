package com.itheima01;

import java.util.ArrayList;

public class Test07 {
    public static void main(String[] args) {
        ArrayList<Teacher> list = new ArrayList<>();
        Teacher t1 = new Teacher("果果老师", "javase");
        Teacher t2 = new Teacher("张1老师", "javase");
        Teacher t3 = new Teacher("张2老师", "php");
        Teacher t4 = new Teacher("张3老师", "python");
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        for (int i = 0; i < list.size(); i++) {
            Teacher t = list.get(i);

            System.out.println("姓名："+t.getName()+", 专业："+t.getSpecialty());


        }



    }
}
