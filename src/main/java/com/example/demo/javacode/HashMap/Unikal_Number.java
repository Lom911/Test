package com.example.demo.javacode.HashMap;

/**
 * Принимает целочисленный список и возвращает количество уникальных целых чисел
 * (откидывает повторяющиеся числа)
 */

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Unikal_Number {
    public static void main(String[] args) {
        List<Integer> vhod = List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        System.out.println(Result(vhod));
    }
    public static int Result(List<Integer> vhod) {

        Set<Integer> exit = new HashSet<>(vhod);
        return exit.size();
    }
}
