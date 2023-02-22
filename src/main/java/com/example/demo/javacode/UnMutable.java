package com.example.demo.javacode;

import java.util.HashMap;
import java.util.Map;

public final class UnMutable {
    private String name;
    private Map<String, String> unMap;

    public UnMutable(String name, Map<String, String> unMap) {
        this.name = name;
        Map<String, String> copyMap = new HashMap<String, String>();
        for (String s : copyMap.keySet()) {
            copyMap.put(s, copyMap.get(s));
        }
        this.unMap = copyMap;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getUnMap() {
        Map<String, String> copyMap = new HashMap<String, String>();
        for (String s : copyMap.keySet()) {
            copyMap.put(s, copyMap.get(s));
        }
        return copyMap;
    }
    
}


