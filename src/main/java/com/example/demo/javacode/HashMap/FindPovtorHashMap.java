package com.example.demo.javacode.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Посчитать кол-во вхождений повторяющегося элемента в массив и вывести их (неповторяющиеся элементы не выводим).
 * В массиве только положительные целые числа. Все можно делать в методе main. [5,3,1,2,1,2,20,20,3,3]
 * Пример:
 * 1->2
 * 2->2
 * 3->3
 * 20->2
 * 5->не выводим
 */
public class FindPovtorHashMap {
    static int[] array = {5, 3, 1, 2, 1, 2, 20, 20, 3, 3};

    public static void main(String[] args) {
        counterNumber(array);
    }

    private static void counterNumber(int[] array) {
        Map<Integer, Integer> findRepeat = new HashMap<>();
        for (int i : array) {
//            if (findRepeat.containsKey(i)) {
//                findRepeat.put(i, findRepeat.get(i) + 1);
//            } else {
//                findRepeat.put(i, 1);
//            }
            findRepeat.merge(i, 1, Integer::sum);











//            findRepeat.merge(i, 1, Integer::sum); // хорошее применение но пока не понимаю как работает
        }


        System.out.println("Показать все ключи    " + findRepeat.keySet()); // получить все ключи
        System.out.println("Показать все значения " + findRepeat.values());
        System.out.println(findRepeat.entrySet()); // выводит в паре ключ - значение

//        for (Integer integer : findRepeat.keySet()) {
//
//         if (findRepeat.get(integer) > 1) {
//                System.out.println("Цифра " + integer + " повторяется " + findRepeat.get(integer) + " раза");
//            }
//        }
        for (Map.Entry<Integer, Integer> entry : findRepeat.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Цифра " + entry.getKey() + " повторяется " + entry.getValue() + " раза");
            }
        }
    }

}
