package com.example.demo.javacode;

public class Lenghth_Last_World {

    /**
     * Вывести длину последнего слова
     *
     */
    public static void main(String[] args) {
        String stroka = "Hello any boys and girls today";
        String[] spisok = stroka.trim().split(" ");
        System.out.println(spisok[spisok.length - 1].length());
    }
}
