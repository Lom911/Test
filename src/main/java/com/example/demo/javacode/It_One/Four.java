package com.example.demo.javacode.It_One;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Вывести в консоль значение и кол-во вхождений
 */
public class Four {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 0, 8, 0, 1, 2, 4, 4, 5, 7, 8, 4, 3, 9, 2, 1, 7, 4, 6, 4, 1, 2};
        Count(arr);
    }
    private static void Count(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(arr)
                .forEach(x -> map.merge(x, 1, Integer::sum));

        map.entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .forEach(x -> System.out.println(x.getKey() + "->" + x.getValue()));
    }
}
