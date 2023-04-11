package com.example.demo.javacode.thread.ds;


/**
 * Задан LinkedList, представляющий собой хранилище целых чисел.
 * Поток ProducerThread c какой-то периодичностью бесконечно
 * добавляет в этот список случайные числа,
 * однако максимальное количество, которое он может
 * добавить, равно 10.
 *
 * Поток ConsumerThread бесконечно считывает числа с какой-то случайной
 * задержкой (от 0 до 10 мс).
 *
 * Сделать так, чтобы метод produce добавлял числа только тогда,
 * когда не превышен лимит, а метод consume забирал их только
 * тогда, когда в списке что-нибудь есть.
 * При этом методы должны корректно работать в многопоточной
 * среде.
 *
 * Создать и запустить два различных потока, один из которых
 * вызывает produce, а другой - consume.
 * Продемонстрировать корректность работы хранилища с помощью
 * вывода сообщений в консоль о добавлении, получении и текущем
 * размере хранилища на этапах добавления и получения.
 */
public class ThreadMain {


    public static void main(String[] args) throws InterruptedException {



        Thread producer = new Thread(new ProducerThread());
        Thread consumer = new Thread(new ConsumerThread());

        producer.start();
        consumer.start();


        if (ListEx.list.size() >= 10){
            producer.wait();
        }
//        producer.join();
//        consumer.join();

        System.out.println(ListEx.list);

    }
}
