package com.example.demo;

/**
 *  made by Andrey Grishin
 */
public class FirstUniqueNumber {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{3, 4, 3, 1, 5, 2, 1, 2}));
    }

    public static int singleNumber(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    break;
                }
            }
            if (j == nums.length) {
                 return nums[i];
            }
        }
        return 0;
    }
}
