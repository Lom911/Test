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
     * Здесь вам нужно реализовать метод conjunctAll,
     * который принимает поток объектов IntPredicate и возвращает один составленный IntPredicate.
     * Этот предикат должен быть конъюнкцией всех входных предикатов, т. е. он возвращает истину только в том случае,
     * если входные предикаты возвращают истину, в противном случае он должен быть ложным.
     * Если входной список пуст, результирующий предикат должен возвращать истину для
     * любого целочисленного значения (он также известен как всегда истинный предикат).
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
