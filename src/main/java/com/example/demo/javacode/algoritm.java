package com.example.demo.javacode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class algoritm {

    /**
     * [2, -4, 10] sum 6 -> [-4, 10]
     * [3, 4, 3] sum 6 -> [3,3]
     * [3, 6] sum 6 -> null
     */

    public static void main(String[] args) {

        int[] list = {3, 6};
        int k = 6;

        System.out.println(Arrays.toString(otvet(list, k)));
    }

    private static int[] otvet(int[] list, int k) {
        int raznica = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            raznica = k - list[i];
            if (map.containsKey(raznica)) {
                return new int[] {map.get(raznica), list[i]};
            } else {
                map.put(list[i], list[i]);
            }
        }
        return null;
    }

}
