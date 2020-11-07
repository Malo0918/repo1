package com.itheima1._01review;

import java.util.ArrayList;

/*

    删除集合中的元素

 */
public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 移动光标所在行的代码: alt + shift + 上下键     牛逼
        //                    ctrl + shift + 上下键
        //                    只能在当前作用域中移动, 移动到if, for, switch, 可以自动缩进
        list.add("1");
        list.add("2");
        list.add("java");
        list.add("java");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        System.out.println(list);

        // 删除集合中所有的"java"
        for (int i = 0; i < list.size(); i++) {
            // 获取i索引位置的元素
            String s = list.get(i);
            // 判断是否是"java"
            if (s.equals("java")) {
                list.remove(s);
                // 作用是在删除了一个元素之后, 再次重新获取这个索引位置的元素
                i--;
            }
        }

        System.out.println(list);


    }
}
