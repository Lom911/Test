package com.example.demo.javacode.yandex;

/**
 * "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB"
 * Нужно написать функцию RLE, которая на выходе даст строку вида:
 * "A4B3C2XYZD4E3F3A6B28"
 * Пояснения: * 1. Если символ встречается 1 раз, он остается без изменений *
 * 2. Если символ повторяется более 1 раза, к нему добавляется количество повторений *
 * public String rle(String str) { // your code }
 * rle("AAAAABBBAAA") = A5B3A3
 */
public class PreobrazovatString {
    public static void main(String[] args) {


        System.out.println(rle("AAAAABBBAAAZZ"));
        System.out.println(rle2("AAAAABBBAAAZZ"));
        System.out.println(rle("AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBBZZ"));
        System.out.println(rle2("AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBBZZ"));
    }
    public static String rle(String str) {
        if (!str.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException();
        }
        StringBuilder res = new StringBuilder();
        int counter = 0;
        char prev = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == prev) {
                counter++;
            } else {
                res.append(str.charAt(i - 1));
                if (counter != 0) {
                    res.append(counter + 1);
                }
                counter = 0;
                prev = c;
            }
        }
        res.append(str.charAt(str.length() - 1));
        if (counter != 0) {
            res.append(counter + 1);
        }
        return res.toString();
    }

    public static String rle2(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        if (!str.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException();
        }
        StringBuilder res = new StringBuilder();
        char[] chars = str.toCharArray();
        int count = 1;
        for (int i = 1; i <= chars.length; i++) {
            if (i == chars.length || chars[i] != chars[i - 1]) {
                res.append(chars[i - 1]);
                if (count > 1) {
                    res.append(String.format("%d", count));
                }
                count = 1;
            } else {
                count++;
            }
        }
        return res.toString();
    }

}
