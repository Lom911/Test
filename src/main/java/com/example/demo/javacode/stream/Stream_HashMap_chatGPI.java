package com.example.demo.javacode.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;


public class Stream_HashMap_chatGPI {
    public static List<String> parseLog(List<String> logs, int threshold) {
        Map<String, Integer> resultMap = new HashMap<>();

        for (String log : logs) {
            String[] split = log.split(" ");
            String key1 = split[0];
            String key2 = split[1];

            int value1 = resultMap.getOrDefault(key1, 0) + 1;
            int value2 = resultMap.getOrDefault(key2, 0) + 1;

            resultMap.put(key1, value1);
            resultMap.put(key2, value2);


        }

        return resultMap.entrySet().stream()
                .filter(entry -> entry.getValue() >= threshold)
                .map(Map.Entry::getKey)
                .sorted(Comparator.comparingInt(Integer::parseInt))
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<String> result = parseLog(asList("4 5 10", "2 4 23", "5 1 100", "6 6 75"), 2);
        checkResult(result, asList("4", "5"));

//        result = parseLog(asList("10 25 210", "1 25 210", "10 5 10", "5 10 100", "4 2 23", "10 3 50", "4 25 10", "5 8 850", "6 22 75", "6 6 74"), 3);
//                checkResult(result, asList("5", "10", "25"));

        System.out.println("Test successful");
    }

    public static void checkResult(List<String> result, List<String> expected) {
        if (!String.join("", result).equals(String.join("", expected))) {
            throw new RuntimeException("Expected: " + expected + ", but was: " + result);
        }
    }
}