package com.example.demo.javacode.hashMap;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Дано
 * Set<Book> books = Set.of(new Book("Author1", "Name1"), new Book("Author1", "Name2"),
 * new Book("Author2", "Name3"), new Book("Author2", "Name4"),
 * new Book("Author3", "Name5"));
 * У Book есть два поля, Author и Name и геттеры
 * На выходе получить Map со списком имён книг по каждому автору
 */
public class Book {

    public String author;
    public String name;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }



    public static void main(String[] args) {

        Set<Book> books = Set.of(
                new Book("Author1", "Name1"),
                new Book("Author1", "Name2"),
                new Book("Author2", "Name3"),
                new Book("Author2", "Name4"),
                new Book("Author3", "Name5")
        );

        Map<String, List<String>> collect = books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor,
                        Collectors.mapping(Book::getName, Collectors.toList())));


        System.out.println(collect);

    }
}
