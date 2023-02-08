package com.example.demo.javacode.Exception;

import java.util.LinkedList;
import java.util.List;

/**
 * У нас имеется массив, состоящий из чисел и других массивов.
 * Вложенные массивы также содержат в себе числа и массивы.
 * Вложенность массивов может быть любой.
 * Нам необходимо "склеить" все элементы исходного массива в одноуровневый массив.
 * Порядок элементов должен сохраниться.
 * <p>
 * # Input: [1, 2,  [[3, [ [4], 0]], 5], 2]
 * # Output: [1, 2, 3, 4, 0, 5, 2]
 */

public class ArrayInArray {

    public static List<Integer> set = new LinkedList<>();

    public static void main(String[] args) {

        Object[] a = {3, 6, 5, 6, 7};
        Object[] b = {2, a, 8};
        Object[] c = {1, b, 8};

        getNumber(c);
        System.out.println(set);
    }
    private static void getNumber(Object[] array) {
        Integer integer;
        for (int i = 0; i < array.length; i++) {
           try {
               integer = (Integer) array[i];
               set.add(integer);

           } catch (ClassCastException e) {
               getNumber((Object[])array[i]);
           }
        }
    }
}