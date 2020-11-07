package com.itheima01;

public class Test05 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        System.out.println(arrayToString(arr));
    }
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);

        }
        return sb.toString();
    }
}
