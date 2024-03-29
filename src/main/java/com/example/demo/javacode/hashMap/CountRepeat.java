package com.example.demo.javacode.hashMap;

//Посчитать кол-во вхождений повторяющегося элемента в массив и вывести их (неповторяющиеся элементы не выводим).
// В массиве только положительные целые числа. Все можно делать в методе main.
// [5,3,1,2,1,2,3,3]
//        Пример:
//        1->2
//        2->2
//        3->3
//        5->не выводим


import java.util.HashMap;
import java.util.Map;

/**
 *  made by Andrey Grishin
 */
public class CountRepeat {
    public static void main(String[] args) {
        printNumber(new int[]{5, 3, 1, 2, 1, 2, 3, 3});
        printNumberV2(new int[]{5, 3, 1, 2, 1, 2, 3, 3});
    }

    public static void printNumber(int[] arr) {
        Map<Integer, Integer> numbers = new HashMap<>();
        int count = 1;

        for (int j : arr) {
            if (numbers.containsKey(j)) {
                count = numbers.get(j) + 1;
            }
            numbers.put(j, count);
        }
        for(Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + "->" + entry.getValue());
            }
        }
    }

    // by d__kadyrbaev
    public static void printNumberV2(int[] arr) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int j : arr) {
            numbers.merge(j, 1, Integer::sum); //хорошее применение метода)
        }
        
        for (Integer key : numbers.keySet()) {
            if (numbers.get(key) > 1) {
                System.out.println(key + " -> " + numbers.get(key));
            }

        }
    }
}
