package com.example.demo.javacode.Sber;

public class StringToInt {
    public static void main (String[] args) {
        int i = stringToInt("1234");
        System.out.println(i);
    }

    public static int stringToInt(String str) {
        var result = 0;
        int isNegative = 1;
        if (str.charAt(0) == '-') {
            isNegative = -1;
            str = str.substring(1);
        }
        for (int i = 0; i < str.length(); i++) {
            result = result * 10 + ((str.charAt(i))) - '0';
        }
        return result * isNegative;
    }

}
