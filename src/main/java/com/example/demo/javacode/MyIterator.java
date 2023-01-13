package com.example.demo.javacode;

/**
 * Не, там не надо четные позиции. Надо четные цифры из массива.
 * Т.е. если массив 1, 1, 4, 1, 4 -> hasNext должен давать тру,
 * а next сразу прыгать на 4-ку, потом на следующую 4-ку
 */
public class MyIterator {
    private int index;
    private  int nextIndex;
    private final int[] numbers;

    boolean isCallNext = false;
    public MyIterator(int... numbers) {
        this.numbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            this.numbers[i] = numbers[i];
        }
        index = 0;
    }


    public boolean hasNext() {
        for (int i = index; i< numbers.length; i++){
            if(numbers[i] % 2 == 0) {
                nextIndex = i;
                return true;
            }
        }
        return false;
    }

    public int next() {
        if (!hasNext()) throw new IndexOutOfBoundsException();
        index = nextIndex;
        return numbers[index];
    }
}
