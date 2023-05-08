package com.example.demo.javacode.leetCode;

/**
 * Напишите функцию, которая находит самую длинную строку общего префикса среди массива строк.
 * Если общего префикса нет, вернуть пустую строку "".
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
//        String[] strs = {""};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix2(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        int count = 0;
        boolean t = true;
        StringBuilder pref = new StringBuilder();
//        if (strs[0].isEmpty()){
//            t = false;
//        }
        while (t && count < strs[0].length()) {
            char chars = strs[0].charAt(count);
            pref.append(chars);
            for (int i = 0; i < strs.length; i++) {
                if (!strs[i].startsWith(String.valueOf(pref))) {
                    t = false;
                    pref.deleteCharAt(count);
                }
            }

            count++;
        }
        return pref.toString();
    }
// GPT
    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
