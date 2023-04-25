package com.example.demo.javacode.stream;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;


public class Stream_HashMap {
    public static List<String> parseLog(List<String> logs, int threshold) {
        Map<String, Integer> resultMap = new HashMap<>();
        List<String[]> s1 = logs.stream()
                .map(s -> s.split(" "))
//                .collect(Collectors.groupingBy(logs.get(0),  ))

                .collect(Collectors.toList());


        for (String[] strings : s1) {
            if (strings[0].equals(strings[1])) {
                resultMap.merge(strings[0], 1, Integer::sum);

            } else {
                resultMap.merge(strings[0], 1, Integer::sum);
                resultMap.merge(strings[1], 1, Integer::sum);
            }
        }
        System.out.println(resultMap);   // строка для отслеживания промежуточного варианта


        return resultMap.entrySet().stream()
                .filter(v -> v.getValue() >= threshold)
                .map(k -> k.getKey())
//                .sorted(Comparator.comparingInt(Integer::parseInt))                    // это 2 варианта исполнения
                .sorted((v1, v2) -> Integer.parseInt(v1) - Integer.parseInt(v2))     // это 2 варианта исполнения
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> result = parseLog(asList("4 5 10", "4 2 23", "5 1 100", "6 6 75"), 2);
        checkResult(result, asList("4", "5"));

        result = parseLog(asList("10 25 210", "1 25 210", "10 5 10", "5 10 100", "4 2 23", "10 3 50", "4 25 10", "5 8 850", "6 22 75", "6 6 74"), 3);
                checkResult(result, asList("5", "10", "25"));

        System.out.println("Test successful");
    }

    public static void checkResult(List<String> result, List<String> expected) {
        if (!String.join("", result).equals(String.join("", expected))) {
            throw new RuntimeException("Expected: " + expected + ", but was: " + result);
        }
    }
}