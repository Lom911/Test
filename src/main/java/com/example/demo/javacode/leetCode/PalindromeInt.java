package com.example.demo.javacode.leetCode;

public class PalindromeInt {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(intIsPalindrome(x));
        System.out.println(isPalindrome2(x));
    }

    public static boolean intIsPalindrome(int x) {

        String str = Integer.toString(x);
        StringBuilder stb = new StringBuilder(str);
        if (str.equals(stb.reverse().toString())) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome2(int x) {
        if (x < 0) {
            return false; // negative integers cannot be palindromes
        }

        int reversed = 0;
        int original = x;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}
