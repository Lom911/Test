package com.example.demo.javacode.HashMap;

import java.util.HashMap;
import java.util.Map;

public class NoRepitHashMap_2 {
    private static int numbers ;

    public static void main(String[] args) {
        int[] nums = {2,2,5};
        int[] nums2 = {4,1,2,8,1,2,4, 9};
        int[] nums3 = {6};

//        singleNumber (nums);
//        singleNumber (nums2);
//        singleNumber (nums3);
//        System.out.println(singleNumber (nums));
        System.out.println(singleNumber (nums2));
//        System.out.println(singleNumber (nums3));
    }
    public static int singleNumber(int[] nums) {
        Map <Integer, Integer> sinNun = new HashMap<>();
        for (int num : nums) {
            if (sinNun.containsKey(num)){
                sinNun.put(num, sinNun.get(num) + 1);
            } else {
                sinNun.put(num, 1);
            }
        }
        System.out.println(sinNun.entrySet());

        for (Integer integer : sinNun.keySet()) {
            if (sinNun.get(integer) == 1) {
                System.out.println(integer);
                numbers = integer;

            }
        }
        return numbers;
    }
}
