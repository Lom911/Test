package com.example.demo.javacode.stepicStream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Sample Input 1:
 * 7 3 -5 2
 *
 * Sample Output 1:
 * 17
 */

class AbsoluteSum {

    public static long sumOfAbsoluteNumbers(Collection<Long> numbers) {
        return numbers.stream()
                .map(x -> Math.abs(x))
                .reduce(0L, Long::sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<Long> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Long::parseLong)
                .collect(Collectors.toList());

        System.out.println(sumOfAbsoluteNumbers(numbers));
    }
}