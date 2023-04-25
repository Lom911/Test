package com.example.demo.javacode.yandex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String string = "gsuiejjcbcjdjkwk";
        String substring = "jeccjb";

        System.out.println(containsPermutation(string, substring)); // O(n * log n)
        System.out.println(containsPermutation2(string, substring)); //  O(n^2)
    }

    public static boolean containsPermutation(String string, String substring) {
        if (string.length() < substring.length()) {
            return false;
        }

        char[] subArr = substring.toCharArray();
        Arrays.sort(subArr); // сортируем символы в подстроке

        for (int i = 0; i <= string.length() - substring.length(); i++) {
            String sub = string.substring(i, i + substring.length());
            char[] subCharArr = sub.toCharArray();
            Arrays.sort(subCharArr); // сортируем символы в текущей подстроке
            if (Arrays.equals(subArr, subCharArr)) { // сравниваем отсортированные строки
                return true;
            }
        }

        return false;
    }
    public static boolean containsPermutation2(String string, String substring) {
        Map<Character, Integer> charCount = new HashMap<>();

        // заполняем Map для подстроки substring
        for (char c : substring.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // проверяем каждую возможную подстроку в строке string
        for (int i = 0; i <= string.length() - substring.length(); i++) {
            String sub = string.substring(i, i + substring.length());
            Map<Character, Integer> subCharCount = new HashMap<>();

            // заполняем Map для текущей подстроки
            for (char c : sub.toCharArray()) {
                subCharCount.put(c, subCharCount.getOrDefault(c, 0) + 1);
            }

            // сравниваем Map'ы для подстроки и текущей подстроки
            if (charCount.equals(subCharCount)) {
                return true;
            }
        }

        return false;
    }

}