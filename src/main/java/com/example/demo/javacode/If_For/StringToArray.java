package com.example.demo.javacode.If_For;

import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        String str = "12345678901";
        int n = 3;
//        String[] result = arrayString(str, n);
        System.out.println(Arrays.toString(arrayString(str, n)));

    }

    public static String[] arrayString(String str, int n) {
        int arrSize = (int)Math.ceil(str.length() / (double)n);
        String[] result = new String[arrSize];
        int counter = 0;
        for (int i = 0; i < str.length(); i += n) {
            if ((i+n) > str.length()){
                result[counter] = str.substring(i, str.length());
            } else {
                result[counter] = str.substring(i, i + n);
            }
            counter++;

        }
        return result;
    }
}
