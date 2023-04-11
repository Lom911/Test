package com.example.demo.javacode.hashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * На вход строка
 * максимальное количество повторяющихся символов подряд
 */
public class String_to_map {
    public static void main(String[] args) {
        String s = "aabbbacccc";
        System.out.println(StoM(s));
        System.out.println(StoMGPT(s));
//        StoM(s);

    }

    private static Map<Character, Integer> StoM(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> reservmap = new HashMap<>();
        int counter = 0;
        int count = 0;
        char superchar = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == superchar) {
                reservmap.merge(s.charAt(i), 1, Integer::sum);
                counter++;
            }
            if ((s.charAt(i) != superchar) || (i == s.length() - 1))
//            else
            {
                if (counter > count)
                {
                    map.clear();
                    map.putAll(reservmap);
                    reservmap.clear();
                    reservmap.merge(s.charAt(i), 1, Integer::sum);
                    superchar = s.charAt(i);
                    count = counter;
                    counter = 0;

                }
                else
                {
                    reservmap.clear();
                    reservmap.merge(s.charAt(i), 1, Integer::sum);
                    superchar = s.charAt(i);
                    counter = 0;

                }
            }
        }
        return map;
    }


    private static Map<Character, Integer> StoMGPT(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char superchar = s.charAt(0);
        int counter = 1;
        int maxCount = 1;
        char maxChar = superchar;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == superchar) {
                counter++;
            } else {
                if (counter > maxCount) {
                    maxCount = counter;
                    maxChar = superchar;
                }
                superchar = c;
                counter = 1;
            }
        }
        if (counter > maxCount) {
            maxCount = counter;
            maxChar = superchar;
        }
        map.put(maxChar, maxCount);
        return map;
    }



}