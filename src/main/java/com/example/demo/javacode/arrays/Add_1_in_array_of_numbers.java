package com.example.demo.javacode.arrays;

import java.util.Arrays;

/**
 * К заданному числу, представленного в виде чисел в массиве, прибавить 1
 * Пример: int[] {1, 2, 3}
 *    Вывод: {1, 2, 4}
 *    Пример2: {9, 9}
 *    Вывод2: {1, 0, 0}
 */

public class Add_1_in_array_of_numbers {


    public static void main(String[] args) {
        int[] array = {9, 9, 9, 9, 9};
        int[] array2 = {1, 3, 5, 7, 9};

        System.out.println(Arrays.toString(addOneToArray(array)));
        System.out.println(Arrays.toString(addOneToArray(array2)));
    }
            public static int[] addOneToArray (int[] test){
                for (int i = test.length -1; i >= 0 ; i--) {
                    if (test[i] == 9 && i != 0){
                        test[i] = 0;
                    }
                    else if (test[i] == 9 && i == 0){
                        int[] newArray = new int[test.length + 1];
                        newArray[0] = 1;
//                        for (int j = 1; j < test.length + 1; j++) {
//                            newArray[j] = 0;
//
//                        }
                        return newArray;
                    }
                    else {
                        test[i]++;
                        break;
                    }

                }
                return test;
            }
}