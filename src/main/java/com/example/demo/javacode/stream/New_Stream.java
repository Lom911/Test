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
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(StartStream(integers));
    }

    private static int StartStream(List<Integer> integers) {
        return (int) integers.stream()
                .peek(System.out::print)
//                .filter(integer -> integer % 5 == 0)
//                .filter(integer -> integer % 2 != 0)
                .peek(System.out::println)
                .count();
//                .map(String::valueOf)
//                .collect(Collectors.joining());
//                .mapToInt(Integer::intValue)
//                .average()
//                .getAsDouble();
    }
}

