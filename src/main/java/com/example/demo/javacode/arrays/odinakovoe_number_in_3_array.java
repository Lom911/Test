package com.example.demo.javacode.arrays;

/**
 * Как решите эту задачу Input: [1,2,4,5], [3,3,4], [2,3,4,5,6]
 * Output: 4.
 * ответ <a href="https://www.geeksforgeeks.org/find-common-elements-three-sorted-arrays/">...</a>
 */

public class odinakovoe_number_in_3_array {
    static int[] arr1 = {1, 2, 4, 5, 6, 7};
    static int[] arr2 = {3, 3, 4, 7};
    static int[] arr3 = {2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {

        povtor2(arr1, arr2, arr3);
    }

    private static void povtor2(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {

            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.println(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;

            }
        }

    }


}
