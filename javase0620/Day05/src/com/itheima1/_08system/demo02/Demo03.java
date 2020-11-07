package com.itheima1._08system.demo02;

import java.util.Arrays;

/*

    数组的拷贝
        src: source
        pos : Position
        dest : destination

    public static void arrayCopy(Object src, : 源数组
                                 int srcPos, : 从源数组的哪个索引开始
                                 Object dest, : 目标数组
                                 int destPos, : 从目标数组的哪个索引开始
                                 int length : 拷贝元素的个数
                                 )
 */
public class Demo03 {
    public static void main(String[] args) {

        int[] src = {1, 2, 3, 4, 5};
        int[] dest = new int[10];

        // 拷贝
        System.arraycopy(src, 0, dest, 3, src.length);

        System.out.println(Arrays.toString(dest));


    }
}
