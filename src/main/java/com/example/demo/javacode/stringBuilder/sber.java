package com.example.demo.javacode.stringBuilder;

//public interface StringReverse {
    /**
     * Преобразует строку:
     *  - все слова меняют направление
     *  - вся пунктуация остается на месте
     *
//     * @param str исходная строка
     * @return результат преобразования

//        String reverse(String str);


public interface sber {
//    @Override
    public String reverse(String str) {
        StringBuilder result = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (isPunct(str.charAt(i))) {
                stringBuilder.reverse();
                stringBuilder.append(str.charAt(i));
                result.append(stringBuilder);
                stringBuilder = new StringBuilder();
                continue;
            }
            if (i == str.length() - 1 && !isPunct(str.charAt(i))) {
                stringBuilder.append(str.charAt(i));
                stringBuilder.reverse();
                result.append(stringBuilder);
                break;
            }

            stringBuilder.append(str.charAt(i));
        }
        return result.toString();
    }

    @Override
    public boolean isPunct(char simbol) {
        char[] punct = new char[]{'.', ',', ';', ':', ' '};// добавить любую пунктуацию
        for (char ch : punct) {
            if (simbol == ch) return true;
        }
        return false;
    }
}

     */
