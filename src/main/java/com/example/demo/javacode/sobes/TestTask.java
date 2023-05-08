package com.example.demo.javacode.sobes;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.	имеется массив чисел, получить список вида {число, количество вхождений числа в массив},
 * список должен быть отсортирован по количеству вхождений,
 * внутри по возрастания числа.
 * Использовать можно любой алгоритмический язык.
 */

public class TestTask {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 2, 1, 4, 2, 1, 3, 2, 4, 1, 1, 1};
        SumInput(arr);
    }
    private static void SumInput(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
                map.merge(arr[i], 1, Integer::sum);
        }

        map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(x -> System.out.println(x.getKey() + " -> " + x.getValue()));

    }
}

