package com.example.demo.javacode.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Среднее всех которые не четные и делятся на 5
 *
 */

public class New_Stream {
    public static void main(String[] args) {
//        ListEx<Integer> integers = ListEx.of(35, 41, 5, 66, 57, 25, 15);
        List<Integer> integers = Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6);
        StartStream(integers);
    }

    private static void StartStream(List<Integer> integers) {
        integers.stream()
                .filter(n -> n > -5 && n <= 5)
//                .peek(System.out::print)
                .filter(n -> n < 0 || n > 2)
//                .filter(integer -> integer % 5 == 0)
//                .filter(integer -> integer % 2 != 0)
                .forEach(System.out::println);
//                .map(String::valueOf)
//                .collect(Collectors.joining());
//                .mapToInt(Integer::intValue)
//                .average()
//                .getAsDouble();
    }
}

