package com.example.demo.javacode.It_One;

/**
 * Дан набор строк, необходимо написать функцию, которая по данному набору
 *  конструирует строку, состоящую
 *  из элементов набора разделённых заданным набором символов.
 */
public class Six {
    public static void main(String[] args) {
        String[] arr = new String[]{"adb", "ysr", "tst"};
        String del = "**";
        String s = Str(arr, del);
        System.out.println(s);
    }
    private static String Str(String[] arr, String del) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i != arr.length; i++) {
            sb.append(arr[i]).append(del);
        }
        return sb.substring(0, sb.length() - del.length());
    }
}
