package com.itheima;
/*

    定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，

​	并在控制台输出结果。例如，数组为 int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]

 */
public class Test05 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(arrayToString(arr));

    }
    public static String arrayToString(int[] arr) {
        if (arr == null) {
            return "null";

        }
        if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result += arr[i];
            } else {
                result +=arr[i]+", ";
            }
        }

        return result +"]";
    }

}
