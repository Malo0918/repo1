package com.itheima03._Demo01;

import java.util.ArrayList;

public class arratListTeacher {
    public static void main(String[] args) {
        ArrayList<Teacher> list = new ArrayList<>();
        Teacher s1 = new Teacher("果果老师","javase");
       Teacher s2 = new Teacher("11老师","22");
       Teacher s3 = new Teacher("22老师","j3vase");
       Teacher s4 = new Teacher("33老师","j44ase");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);


        for (int i = 0 ; i<list.size();i++){
            Teacher t=list.get(i);
        System.out.println(t.getName()+"--------"+t.getSpecialty());
    }}
}
