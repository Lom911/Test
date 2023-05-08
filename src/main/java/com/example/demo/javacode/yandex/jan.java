package com.example.demo.javacode.yandex;

public class jan {
    public static void main(String[] args) {
        System.out.println(OneEditApart("abcd", "abc"));
    }

    public static boolean OneEditApart(String str1, String str2) {
        // Если длина разницы между строками больше 1, то они точно не могут отличаться за одно исправление
        if (Math.abs(str1.length() - str2.length()) > 1) {
            return false;
        }

        // Переменная для подсчета количества несовпадений символов
        int countDiff = 0;

        // Проходим по символам двух строк, сравнивая их
        int i = 0, j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) != str2.charAt(j)) {
                countDiff++;

// Если количество несовпадений больше одного и длина строк разная,
                // то это значит, что нельзя получить одну строку из другой за одно исправление
                if (countDiff > 1 && str1.length() != str2.length()) {
                    return false;
                }
// Если длина строк одинаковая, то мы можем изменить один из символов и продолжить сравнение
                if (str1.length() == str2.length()) {
                    i++;
                    j++;
                }
// Если длина одной из строк больше, то мы можем удалить символ в более длинной строке и продолжить сравнение
                else if (str1.length() > str2.length()) {
                    i++;
                } else {
                    j++;
                }
            } else {
                i++;
                j++;
            }
        }

        // Возвращаем true, если количество несовпадений меньше или равно 1
        return countDiff <= 1;
    }
}