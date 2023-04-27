package com.example.demo.javacode.Sber;

/**
 * что выводит данный код
 */

public class Sber1 {
    public static void main(String[] args) {
        var a = new int[1];
        a[0] = 21;
        Integer b = Integer.valueOf(17);

        inc(a[0]);
        inc(b);

        System.out.println(a[0]);
        System.out.println(b);
    }

    private static void inc(int[] a) {
        ++a[0];
    }

    private static void inc(int a) {
        ++a;
    }

    private static void inc(Integer b) {
        ++b;
    }
}
