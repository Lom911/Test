package com.example.demo.javacode.It_One;

import java.util.Arrays;
import java.util.List;

public class Three {
    //Найти первый не повторяющийся символ. Например: //"abc" => a //"abca" => b //"abcab" => c //"abcabcd" => d
    //Объединить строку ["a","bC7","d"] -> "A,BC7,D"
    public static void main(String[] args) {
        String str = "a, b, c, a";
        System.out.println(getFirstUnique(str));
        System.out.println(join(Arrays.asList("a","bC7","d")));
    }

    public static Character getFirstUnique(String st) {
        char[] carArr = st.toCharArray();
        int count;
        for (int i = 0; i < carArr.length; i++) {
            count = 0;
            for (int j = 0; j < carArr.length; j++) {
                if (carArr[i] == carArr[j] && i != j) {
                    count++;
                }
            }
            if (count == 0) {
                return carArr[i];
            }
        }
        return null;
    }
    public static String join(List<String> list) {
        StringBuilder strBuild = new StringBuilder();
        for (String st : list) {
            strBuild.append(st.toUpperCase()).append(",");
        }
        return strBuild.substring(0, strBuild.length() - 1);
    }
}






