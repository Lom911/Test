package com.example.demo.javacode.It_One;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Найти первое уникальное значение
 */
public class Seven {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, -7, -7, -7, 1, 2, 5, 3, 1, 2};
        int n = getFirstUnique(arr);
        System.out.println("Найдено уникальное значение " + n);
    }

    private static int getFirstUnique(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(arr).forEach((e) -> map.merge(e, 1, Integer::sum));
        return Arrays.stream(arr).filter((e) -> map.get(e) < 2)
                .findFirst()
                .orElse(0);
    }
}

