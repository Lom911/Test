package org.example;

import java.util.HashMap;
import java.util.Map;


/**
 * Дан текст:  “Hello my friend my friend”
 * // надо подсчитать количество вхождений слов в текст.
 */

public class It_One {

    public static void main(String[] args) {
        String str = "Hello my friend my friend";
        Vhod(str);
    }

    public static void Vhod(String str) {
        String[] text = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length; i++) {
            map.merge(text[i], 1, Integer::sum);
        }
        map.entrySet().stream()
                .forEach(x -> System.out.print(x.getKey() + " " + x.getValue()));
    }

  }

