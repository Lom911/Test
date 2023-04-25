package com.example.demo.javacode.yandex;

public class polindrom {

    /**
     *  Сложность O(n)
     */
    public static void main(String[] args) {
        String s = "Ка зак!";
        s = s.replaceAll("[^A-Za-zА-Яа-я0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(s).reverse();
        if (s.contentEquals(sb)) {
//        if (s.equals((new StringBuilder(s)).reverse().toString().toLowerCase())) // заменяет две строчки выше
            System.out.println("Палиндром! " + s);
        }

        else
            System.out.println("Не палиндром! :( " + s);
    }
}

