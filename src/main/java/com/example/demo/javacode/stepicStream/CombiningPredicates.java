package com.example.demo.javacode.stepicStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class CombiningPredicates {

    /**
     * Here, you need to implement the conjunctAll method that accepts a stream of IntPredicate
     * objects and returns one composed IntPredicate.
     * This predicate must be a conjunction of all the input predicates,
     * i.e. it returns true only if the input predicates return true, otherwise it must be false.
     * If the input list is empty, the resulted predicate must return true for any integer value
     * (it is also known as always true predicate).
     */
    public static IntPredicate conjunctAll(Stream<IntPredicate> predicates) {
        return predicates.reduce(x -> true, (x, y) -> x.and(y));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split("\\s+");

        List<Boolean> values = Arrays.stream(strings)
                .map(CombiningPredicates::parseBooleanOrTrue)
                .collect(Collectors.toList());

        List<IntPredicate> predicates = new ArrayList<>();
        values.forEach(v -> predicates.add(x -> v));

        System.out.println(conjunctAll(predicates.stream()).test(0));
    }

    private static boolean parseBooleanOrTrue(String item) {
        if (item == null || "".equals(item.trim())) {
            return true;
        }
        return Boolean.parseBoolean(item);
    }
}
