package com.example.demo.javacode.leetCode;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        nums = Arrays.stream(nums)
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(nums));
       return nums.length;
    }
}
