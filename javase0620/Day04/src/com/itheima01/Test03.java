package com.itheima01;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = {3,6,9};
        System.out.println(arrayToString(arr));
    }
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(", ");
            }
            }
            return sb.toString();
        }

}