package com.itheima1._05object.demo02;

import java.util.ArrayList;
/*

    输出语句打印出来的内容, 如果不是地址值, 那么它一定重写了toString()


 */
public class Demo02 {
    public static void main(String[] args) {

        // 数组打印是地址值
        // 实际调用的是Object中的toString方法

        // 集合打印是其中的元素
        // ArrayList的爷爷类, 重写toString()

        // 输出语句是否调用toString打印的结果是一样的
        // 源代码默认调用toString()

        ArrayList<String> list = new ArrayList<>();

        list.add("张三");
        list.add("李四");

        // 输出语句默认调用toString
        System.out.println(list);
        // Systems是一个类
        // out : System类中的一个类变量
        System.out.println(list.toString());

    }
}
