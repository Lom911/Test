package com.example.demo.javacode.sobes;

import java.util.HashMap;
import java.util.Map;

/**
 * 2.	написать алгоритм проверки корректности регулярного выражения, которое включает [,],(,)
 * т.е., например ([][[]()]) - правильно, ([][]()]) – неправильно
 */

public class TestTask2 {
    public static void main(String[] args) {
        String str1 = "([][[]()])";
        String str2 = "([][]()])";

        CorrectExpression(str1);
    }

    private static void CorrectExpression(String str) {
        Map<String,Integer> map = new HashMap<>();
        String[] pars = str.split("");
        for (int i = 0; i < pars.length; i++) {
            map.merge(pars[i], 1, Integer::sum);
        }
        if ((map.get("(").equals(map.get(")"))) && (map.get("[").equals(map.get("]"))) ){
            System.out.println("правильно");
        }
        else {
            System.out.println("неправильно");
        }
    }
}
