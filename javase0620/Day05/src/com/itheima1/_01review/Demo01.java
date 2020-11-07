package com.itheima1._01review;
/*
    StringBuilder
        是一个可变的字符序列

        append进行拼接的时候, 直接在本身进行操作, 不需要接收

 */
public class Demo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append(10).append("哈哈哈");

        // StringBuilder类中, 也有substring的方法
        // substring()方法, 返回的是String类型, 截取之后的结果是String类型
        // 没有修改原有的StringBuilder, 只是将截取之后的String返回
        String s = sb.substring(2);
        System.out.println(s);

        System.out.println(sb);
    }
}
