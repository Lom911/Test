package com.example.demo.javacode.It_One;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Находит первый неповторяющийся элемент в наборе целых чисел. Например, для набора {4,5,7,5,4,9,4} должно вернуться значение 7 ~20 мин
 */
public class Two {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 5, 4, 9, 4};
        System.out.println(firstUniq(arr));
    }
    public static int firstUniq(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.merge(arr[i], 1, Integer::sum);
        }
        return map.entrySet().stream()
                .filter(n -> n.getValue() < 2)
                .findFirst()
                .map(Map.Entry::getKey)
                .get();
//                .orElse(000);
    }
}

