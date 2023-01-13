package com.example.demo.javacode;

public class FindSimpleNumber {

    public static void main(String[] args) {
        int[] number = {45, 7, 105, 41, 3};
        simpleNumber(number);
    }

    private static void simpleNumber(int[] number) {
        for (int k : number) {
            boolean simple = true;

            for (int j = 2; j < k; j++) {
                if (k % j == 0) {
                    simple = false;
                    System.out.println(k + " нет");
                    break;
                }
            }
            if (simple) {
                System.out.println(k + " простое число");
            }
        }
    }
}
