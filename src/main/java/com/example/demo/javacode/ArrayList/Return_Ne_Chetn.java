package com.example.demo.javacode.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Принимает целочисленный список и возвращает список только с нечетными значениями
 */
public class Return_Ne_Chetn {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(resultList(list));
    }
    private static List<Integer> resultList(List<Integer> list) {
        List<Integer> arrayList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 3 != 0) {
                arrayList.add(integer);
            }
        }
        return arrayList;
    }
}
