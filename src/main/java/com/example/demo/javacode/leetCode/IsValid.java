package com.example.demo.javacode.leetCode;

import java.util.Stack;

public class IsValid {
    public static void main(String[] args) {
//        String s = "]";
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
                stack.push(ch[i]);
            } else if (ch[i] == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch[i] == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            } else if (ch[i] == '}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        System.out.println(stack);
        return stack.empty();
    }

    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}
