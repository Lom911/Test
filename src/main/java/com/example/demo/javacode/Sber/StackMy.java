package com.example.demo.javacode.Sber;

import java.util.ArrayList;
import java.util.List;

/**
 * Одна из задач: составить программу, реализующую логику стека методами push() и pop()
 * по сложности О(1) + метод min()(возвращает минимальное значение из стека).
 */

public class StackMy {
    private List<Integer> stack = new ArrayList<>();
    private Integer min;

    public void push(Integer x) {
        stack.add(x);
        if (min == null || min > x) {
            min = x;
        }
    }

    public Integer pop() {
        Integer x;
        x = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        if (x == min) {
            findMin();
        }
        return x;
    }

    private void findMin() {
        if (stack.size() >= 1) {
            min = stack.stream().min(Integer::compareTo).get();
        }
    }

    public int size() {
        return stack.size();
    }

    public Integer min() {
        return min;
    }
}

