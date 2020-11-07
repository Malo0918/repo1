package com.itheima1._11wrapper;
/*

    将指定格式的字符串, 转换成基本数据类型

    "100" ->  100 -> int类型
    "23.4"  -> 23.4 -> double类型
    "false" -> false -> boolean类型


 */
public class Demo03 {
    public static void main(String[] args) {
        String s = "1234";
        // public static int parseInt(String s)
        // 将字符串转换成 int类型
        int i = Integer.parseInt(s) + 3000;
        System.out.println(i);

        String s2 = "false";
        boolean b = Boolean.parseBoolean(s2);
        System.out.println(b);

        // 为什么Character没有?
        // 将字符串转换成对应的基本数据类型,  字符串中包含多个字符
        // 不可能将字符串转换成1个字符
        // 想将字符串转换成字符的话, 只能转换成字符数组 -> toCharArray()

    }
}
