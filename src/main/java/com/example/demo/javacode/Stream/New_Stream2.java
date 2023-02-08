package com.example.demo.javacode.Stream;

import java.util.List;

/**
 * Дан список строк
 * найти количество не повторяющихся строк длинной более 8 символов
 */

public class New_Stream2 {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "String - 1",
                "String - 2",
                "String - 3",
                "String - 1",
                "String - 2",
                "String - 3",
                "St - 4",
                "Sgffhfgd - 5"
        );
        System.out.println(Go_Stream (strings));
    }

    private static int Go_Stream(List<String> strings) {
        return (int) strings.stream()
                .filter(str -> str.length() > 8)
                .distinct()
                .count();

    }
}
