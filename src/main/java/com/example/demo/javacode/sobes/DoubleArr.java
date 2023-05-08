package com.example.demo.javacode.sobes;

import java.util.Arrays;

public class DoubleArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(doubleArr(arr)));
    }

    private static int[] doubleArr(int[] arr) {
        int[] doubleArr = new int[arr.length * 2];
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = arr[i % arr.length];
        }
        return doubleArr;
    }
}
