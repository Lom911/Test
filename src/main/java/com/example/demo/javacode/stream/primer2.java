package com.example.demo.javacode.stream;

import java.util.Comparator;
import java.util.List;

/**
 * 5. Дан класс Person с полями firstName, lastName,
 * age.
 * Вывести полное имя самого старшего человека, у
 * которого длина этого имени не превышает 15
 * символов.
 */
public class primer2 {
    public static void main(String[] args) {


    List<Person> persons = List.of(
            new Person("Ivan", "Ivanov", 20),
            new Person("Petr", "Petrov", 25),
            new Person("Sveta", "Svetikova", 33),
            new Person("Kate", "Ivanova", 25),
            new Person("Slava", "Slavikov", 18),
            new Person("Arni", "Kutuzov12324", 56)
    );
    persons.stream()
            .filter(x -> x.getFullName().length() <= 15)
            .max(Comparator.comparing(Person::getAge))
            .map(Person::getFullName)
            .ifPresent(System.out::println);


}}
