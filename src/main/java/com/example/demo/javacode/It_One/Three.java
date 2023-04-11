package com.example.demo.javacode.It_One;

import java.util.Arrays;
import java.util.List;

public class Three {
    //Например: //"abc" => a //"abca" => b //"abcab" => c //"abcabcd" => d
    //expected "A,BC7,D" } // ["a","bC7","d"] -> "A,BC7,D"
    public static void main(String[] args) {
        String str = "a, b, c, a";
        System.out.println(getFirstUnique(str));
        System.out.println(join(Arrays.asList("a","bC7","d")));
    }

    public static Character getFirstUnique(String st) {
        char[] carArr = st.toCharArray();
        int count;
        for (int i = 0; i < carArr.length; i++) {
            count = 0;
            for (int j = 0; j < carArr.length; j++) {
                if (carArr[i] == carArr[j] && i != j) {
                    count++;
                }
            }
            if (count == 0) {
                return carArr[i];
            }
        }
        return null;
    }
    //public static String join(List<String> list) { return ""; } }
    public static String join(List<String> list) {
        StringBuilder strBuild = new StringBuilder();
        for (String st : list) {
            strBuild.append(st.toUpperCase()).append(",");
        }
        return strBuild.substring(0, strBuild.length() - 1);
    }
}



//        create table users
//        (user_id int8 not null,
//        user_name varchar(50)not null,
//        user_group varchar(50)not null,
//        salary int8 default 0not null,
//        constraint pk_users primary key(user_id))
//
//        --user_group in'ACCOUNTING','IT','TRANSPORTATION'
//        select user_group,sum(salary)
//        from users having user_id>100 and sum(salary)>2000
//
//        select user_group, sum(salary)// исправленный вариант
// from users where user_id>100 group by user_group having sum(salary) > 2000
//
//
//        public static void main(String[]args){
//
//



