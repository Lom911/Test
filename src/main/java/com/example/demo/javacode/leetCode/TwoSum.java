package com.example.demo.javacode.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3,4};
        int target = 7;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[] {map.get(target - nums[i]), i};
            }
            else {
                map.put(nums[i], i);
            }
        }
        return new int[] {0,0};
    }
}
