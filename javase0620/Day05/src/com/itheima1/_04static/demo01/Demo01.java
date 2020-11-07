package com.itheima1._04static.demo01;
/*
    类变量, 被所有对象共享

 */
public class Demo01 {
    public static void main(String[] args) {

        Student.school = "白马程序员";

        Student.fun();

        /*Student s1 = new Student("张无忌", 25);
        Student s2 = new Student("周芷若", 27);
        Student s3 = new Student("赵敏", 18);

        // 默认调用toString()
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);*/
    }
}
