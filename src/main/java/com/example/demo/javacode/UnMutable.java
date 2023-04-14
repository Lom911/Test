package com.example.demo.javacode;

import java.util.HashMap;
import java.util.Map;

public final class UnMutable {
    private final String name;
    private final Map<String, String> unMap;

    public UnMutable(String name, Map<String, String> unMap) {
        this.name = name;
        Map<String, String> copyMap = new HashMap<>();
        for (String s : unMap.keySet()) {
            copyMap.put(s, copyMap.get(s));
        }
        this.unMap = copyMap;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getUnMap() {
        Map<String, String> copyMap = new HashMap<>();
        for (String s : unMap.keySet()) {
            copyMap.put(s, copyMap.get(s));
        }
        return copyMap;
    }
    
}


