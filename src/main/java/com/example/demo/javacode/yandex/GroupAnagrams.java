package com.example.demo.javacode.yandex;


    import java.util.*;

/**
 * Sample Input ["eat", "tea", "tan", "ate", "nat", "bat"]
 * Sample Output [ ["ate", "eat", "tea"], ["nat", "tan"], ["bat"] ]
 * Т.е. сгруппировать слова по "общим буквам".
 */

// Сложность сортировки символов в слове - O(k*log(k)), где k - длина слова
    //Поэтому общая сложность алгоритма - O(nklog(k)).
public class GroupAnagrams {
        public static void main(String[] args) {
            String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
            System.out.println(groupAnagrams(str));

        }
        public static List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String key = new String(chars);
                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(str);
            }
            return new ArrayList<>(map.values());
        }
    }

