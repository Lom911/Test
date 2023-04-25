package com.example.demo.javacode.yandex;

import java.util.Arrays;

/**
 * Дан массив целых чисел int[] {7,4,5,2,3,9,8,11,3}.
 * Нужно найти минимальное произведение двух чисел.
 */
public class findMinimumProduct {
    public static void main(String[] args) {  // сортировка O(n log n). Остальные операции O(1).
        int[] arr = {-7, -4, -5, -2, -3, -9, -8, -11, -3};
        int[] arr2 = {7, 4, 5, 2, 3, 9, 8, 11, 3};
        int[] arr3 = {-7, 4, 5, 2, -3, 9, 8, 11, 3};
        System.out.println(findMinProduct(arr));
        System.out.println(findMinProduct(arr2));
        System.out.println(findMinProduct(arr3));
    }

    public static int findMinProduct(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (arr[0] < 0 && arr[n - 1] < 0) {
            return arr[n - 1] * arr[n - 2];
        } else if (arr[0] > 0 && arr[n - 1] > 0) {
            return arr[0] * arr[1];
        } else {
            return arr[0] * arr[n - 1];
        }
    }
}
