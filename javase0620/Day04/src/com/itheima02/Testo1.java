package com.itheima02;

public class Testo1 {
    public static void main(String[] args) {
        Person p1 = new Java();
        Person p2 = new Ui();
        p1.wolk();
        p2.wolk();
        ((Ui) p2).drawing();
    }

}
