package com.example.demo.javacode;

import java.util.Random;

public class Password {
    public static void main(String[] args) {
        int len = 4; // длина пароля
        System.out.println(geek_password(len));
    }

       static char[] geek_password(int len)
    {
        System.out.println("generat");
        System.out.println("new");

//        символы

     String big_char = "QWERTYUIOPASDFGHJKLZXCVBNM";
     String small_char = "qwertyuiopasdfghjklzxcvbnm";
     String numbers = "1234567890";
     String symbol = "!@#$%^&*()?";

//     String values = big_char + small_char +numbers + symbol;
     String values = numbers + small_char + big_char + symbol;

        Random rndm = new Random();
        char[] password = new char[len];


        for (int i = 0; i < len; i++) {
            password[i] = values.charAt(rndm.nextInt(values.length()));

        }
        return password;
    }
}
