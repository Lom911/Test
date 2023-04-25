package com.example.demo.javacode.yandex;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * Примеры: [1,4,5,2,3,9,8,11,0] => "0-5,8-9,11"
 * [1,4,3,2] => "1-4"
 * [1,4] => "1,4"
 */
public class ArrayCompressor {
    public static void main(String[] args) {

        int[] arr = {1,4,5,2,3,9,8,11,0};
        int[] arr2 = {1,4,3,2};
        int[] arr3 = {1,4};
        System.out.println(sort(arr));
        System.out.println(sort(arr2));
        System.out.println(sort(arr3));
    }
    private static String sort(int[] arr) {
            if (arr == null || arr.length == 0) {
                return "";
            }
            Arrays.sort(arr);
            int start = arr[0];
            int prev = start;
            StringJoiner joiner = new StringJoiner(",");
            for (int i = 1; i < arr.length; i++) {
                int curr = arr[i];
                if (curr != prev + 1) {
                    if (start != prev) {
                        joiner.add(start + "-" + prev);
                    } else {
                        joiner.add(Integer.toString(start));
                    }
                    start = curr;
                }
                prev = curr;
            }
            if (start != prev) {
                joiner.add(start + "-" + prev);
            } else {
                joiner.add(Integer.toString(start));
            }
            return joiner.toString();
        }
}

