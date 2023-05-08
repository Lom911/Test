package com.example.demo.javacode.leetCode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));

    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        String[] str = s.split(" ");
        return str[str.length -1].length();
    }
}
