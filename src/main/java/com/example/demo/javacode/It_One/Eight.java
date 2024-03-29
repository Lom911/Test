package com.example.demo.javacode.It_One;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *     дано: лист/массив чисел
 *  нужно перенести все 0 в конец списка, сохранив остальной порядок
 */

public class Eight {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZerosToEnd(new int[]{5, 7, 0, 4, 0, 4, 7, 0})));
        List<Integer> list = List.of(5, 7, 0, 4, 0, 4, 7, 0);
        System.out.println(moveZerosToEnd2(list));

    }


    public static int[] moveZerosToEnd(int[] numbers) {
        int[] result = new int[numbers.length];
        int notZeroIndex = 0;
        for (int number : numbers) {
            if (number != 0) {
                result[notZeroIndex] = number;
                notZeroIndex++;
            }
        }
        return result;
    }
// Второй вариант решения более красивый
    private static List<Integer> moveZerosToEnd2(List<Integer> list) {
        List<Integer> arr = new ArrayList<>(list);

        arr.sort((o1, o2) -> {
            if (o1 == 0) return 1;
            if (o2 == 0) return -1;
            return 0;
        });

        return arr;
    }

}



