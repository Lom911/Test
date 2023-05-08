package com.example.demo.javacode.leetCode;

public class StrStr {
    public static void main(String[] args) {
        String haystack = "sdbutad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
//        if (!haystack.contains(needle)) {
//            return -1;
//        }
//        else {
            return haystack.indexOf(needle);
//        }
    }
}
