package com.example.demo.javacode;

import java.util.HashMap;
import java.util.Map;

public class Test_unMutable {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Привет семье", "Поехали");
        UnMutable unMutable = new UnMutable("Неизменяемый класс", map);
        unMutable.getUnMap().put("еще херня", "и еще");
        unMutable.getUnMap().keySet().forEach(e -> System.out.println(e));
    }

}
