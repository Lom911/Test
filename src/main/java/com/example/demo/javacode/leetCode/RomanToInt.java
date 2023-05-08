package com.example.demo.javacode.leetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        String str = "MCMLXXXIV"; //1984
        System.out.println(romanToInt(str));


    }

    private static int romanToInt(String str) {
        Map<Character, Integer> map2 = new HashMap<>();
        map2.put('I', 1);
        map2.put('V', 5);
        map2.put('X', 10);
        map2.put('L', 50);
        map2.put('C', 100);
        map2.put('D', 500);
        map2.put('M', 1000);
        int proverka = 0;
        int sum = 0;

        char[] ch = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (map2.get(ch[i]) >= proverka) {
                sum += map2.get(ch[i]);
            } else {
                sum -= map2.get(ch[i]);
            }
            proverka = map2.get(ch[i]);

        }
        return sum;
    }
}
