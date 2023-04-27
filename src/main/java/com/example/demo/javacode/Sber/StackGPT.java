package com.example.demo.javacode.Sber;

import java.util.EmptyStackException;

public class StackGPT {
    public static void main(String[] args) {
        StackWithMin stack = new StackWithMin(10);
        stack.push(5);
        stack.push(3);
        stack.push(7);
        System.out.println(stack.min()); // Output: 3
        stack.pop();
        System.out.println(stack.min()); // Output: 3
        stack.pop();
        System.out.println(stack.min()); // Output: 5
    }
    public static class StackWithMin {
        private int[] stack;
        private int top;
        private int[] minStack;
        private int minTop;

        public StackWithMin(int capacity) {
            stack = new int[capacity];
            minStack = new int[capacity];
            top = -1;
            minTop = -1;
        }

        public void push(int value) {
            if (top == stack.length - 1) {
                throw new StackOverflowError();
            }
            top++;
            stack[top] = value;
            if (minTop == -1 || value <= minStack[minTop]) {
                minTop++;
                minStack[minTop] = value;
            }
        }

        public int pop() {
            if (top == -1) {
                throw new EmptyStackException();
            }
            int value = stack[top];
            top--;
            if (value == minStack[minTop]) {
                minTop--;
            }
            return value;
        }

        public int min() {
            if (minTop == -1) {
                throw new EmptyStackException();
            }
            return minStack[minTop];
        }
    }
}
