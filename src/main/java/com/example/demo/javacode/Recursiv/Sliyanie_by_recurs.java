package com.example.demo.javacode.Recursiv;

import java.util.Arrays;




public class Sliyanie_by_recurs {

//    static int[] array = {7, 3, 4, 2};
    static int[] array = {3, 7, 2, 5, 1, 6, 4, 9, 8};

    public static void main(String[] args) {
//        mergeSort (array);
        System.out.println( Arrays.toString( mergeSort (array)));
    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, array.length / 2, array.length); // left.length
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int [left.length + right.length];
        int i = 0;
        int j = 0;
        int resIn = 0;
        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                result[resIn] = left[i];
                resIn++;
                i++;
            }
            else {
                result[resIn] = right[j];
                resIn++;
                j++;
            }
        }
        while (resIn < result.length) {
            if (i != left.length) {
                result[resIn] = left[i];
                resIn++;
                i++;
            }
            else {
                result[resIn] = right[j];
                resIn++;
                j++;
            }
        }
//        System.out.println(Arrays.toString(result));
        return result;
    }
}