package com.example.demo.javacode;

import java.util.LinkedHashMap;
import java.util.Map;

// написать метод который принимает массив интов и вывести число,
// которе встречается чаще всего в нем.
//
public class MajorityElement {
    static int[] array = {5, 5, 2, 9, 1, 1, 9, 2, 1, 3, 12, 3, 7, 8, 9,};
    public static void main(String[] args) {
        System.out.println(getMajorityElement(array));
    }
    public static int getMajorityElement(int[] array){
        Map<Integer, Integer> poisk = new LinkedHashMap<>();


        for (int j : array) {
            if (poisk.containsKey(j)) {
                poisk.put(j, poisk.get(j) + 1);

            } else {
                poisk.put(j, 1);
            }
//            for (int i = 0; i < array.length; i++) {
//           if (poisk.containsKey(array[i])) {
//            poisk.put(array[i], poisk.get(array[i])+1);
//            }
//            else {
//                poisk.put(array[i], 1);
//           }

        }
        int summ = 0;
        int resultnumber = 0;
        for (Integer number:poisk.keySet()) {
            if (poisk.get(number) > summ){
//                System.out.println(number);
                summ = poisk.get(number);
               resultnumber = number;
           }
        }
        return resultnumber;
    }

}
