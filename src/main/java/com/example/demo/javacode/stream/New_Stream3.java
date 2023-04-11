package com.example.demo.javacode.stream;

import java.util.Map;

/**
 * Даны ключ - значение Map<String, Integer>
 * сумму всех значений длина ключа которых меньше 7
 */

public class New_Stream3 {
    public static void main(String[] args) {
        Map<String, Integer> mapToKey = Map.of(
                "String1", 1,
                "Sing2", 1,
                "String3", 1,
                "Sng4", 1,
                "String5", 1,
                "String6", 1
        );
        System.out.println(Go_Stream (mapToKey));
    }

    private static int Go_Stream(Map<String, Integer> mapToKey) {
        return mapToKey.entrySet().stream()
                .filter(entry ->entry.getKey().length() < 7)
                .mapToInt(entry -> entry.getValue())
                .sum();

    }
}
