package com.example.demo.javacode.hashMap;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Na_HashMap {
    public static void main(String[] args) {
        Map<String, String> map = Map.of(
                "Alex", "Lom",
                "Sveta", "Svetikova",
                "Petr", "Petrov",
                "Sergey", "Lom"
        );

        System.out.println((Unic(map)));

    }

    private static boolean Unic(Map<String, String> map) {
        Set<String> map2 = new HashSet<>(map.values());
        return map.size() == map2.size();
    }


}
