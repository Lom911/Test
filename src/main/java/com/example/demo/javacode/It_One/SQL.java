package com.example.demo.javacode.It_One;

public class SQL {

//    Написать SQL-запрос, который выбирает количество книг каждого автора, доступное в библиотеке.
//    Таблицы: library(id, book_id, count),
//    books(id, author_id, name),
//    authors(id, name).
//    Вывести в виде таблицы author_name, books_count.

//    Решение

//    SELECT a.name AS author_name, SUM(l.count) AS books_count
//    FROM books b JOIN library l ON b.id = l.book_id
//    JOIN authors a ON a.id = b.author_id
//    WHERE b.id = l.book_id
//    GROUP BY author_name;

//    create table
//
//    population(city varchar(255) not null,
//
//    country varchar(255) not null,
//    people integer
//    not null);
//    insert into
//
//    population values('Moscow','USA',25000);
//
//    insert into
//
//    population values('Moscow','Russia',12000000);
//
//    insert into
//
//    population values('Saint Petersburg','USA',270000);
//
//    insert into
//
//    population values('Liechtenstein','Liechtenstein',38000);
//
//    insert into
//
//    population values('Saint Petersburg','Russia',5000000);
//
//    insert into
//
//    population values('New York','USA',8400000);
//
//    insert into
//
//    population values('Shanghai','China',24800000);
//
//    insert into
//
//    population values('Andorra','Andorra',82000);
//
//    insert into
//
//    population values('Beijing','China',21000000); #
//    Вывести список
//    стран и
//    численность населения, где
//    населения меньше 1
//    млн человек
//    SELECT country, SUM(people)
//    FROM population
//    GROUP BY
//    country HAVING
//
//    SUM(people) < 1000000;
}
