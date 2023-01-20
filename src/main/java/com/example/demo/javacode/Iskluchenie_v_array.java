package com.example.demo.javacode;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  Даны два отсортированных массива.
 *  Вывести все элементы первого массива (len = N), которые не встречаются во втором (len = M).
 *  Пример
 *  // filter([4, 7], [2, 3, 4, 6]) => [7]
 */
public class Iskluchenie_v_array {

    static int[] array1 = {4, 7, 9};
    static int[] array2 = {2, 3, 4, 6};


    public static void main(String[] args) {
//        vibor (array1, array2);
        vibor2 (array1, array2);


    }

    private static void vibor2(int[] array1, int[] array2) { // не рабочее для этого примера
        int[] arr3 = Stream.of(array1, array2)
                .flatMap(arr -> Arrays.stream(arr).distinct().boxed())
                // группируем в карту по количеству вхождений
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                // обходим карту
                .entrySet().stream()
                // количество больше одного
                .filter(e -> e.getValue() == 1)
                // получаем сами элементы
                .map(e -> e.getKey())
                // получаем 'int' значения элементов
                .mapToInt(Integer::intValue)
                // собираем в массив
                .toArray();

// выводим массив повторяющихся элементов
        System.out.println(Arrays.toString(arr3)); // [2, 3, 6, 7, 9] НЕ ВЕРНО
    }

    public static void vibor(int[] array1, int[] array2) {

        for (int i = 0; i < array1.length; i++) {
            boolean test = false;
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]) {
                    test = true;
                }
            }
            if (test == false) {
                System.out.println(array1[i]);

            }

        }


    }



}

