package com.example.demo.javacode.arrays;

import java.util.Arrays;

public class ArrayMarge {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {3, 4, 6,};


        System.out.println(Arrays.toString(ArrMarge(arr1, arr2)));
    }

    private static int[] ArrMarge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        Arrays.sort(result);
        return result;


    }
}
