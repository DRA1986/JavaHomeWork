package com.pb.danilenko.hw5;

public class Library {

    public static void main (String[] args) {
        Reader reader1 = new Reader("Иванов", 3,"101","FAK_A","20.12.86","+380939806781");
        Reader reader2 = new Reader("Петров", 2, "102", "FAK_B", "21.12.86","+380939806782");
        Reader reader3 = new Reader("Сидоров", 1, "103", "FAK_C", "22.12.86","+380939806783");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Задача трех тел", "Лю Цысинь", "2012");
        Book book2 = new Book("Дюна", "Фрэнк Герберт","1956");
        Book book3 = new Book("Пикник на обочине", "Стругацкие", "1999");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(5);
        reader2.takeBook("Космоблохи, Громко", "Java программирование, Шило");
        reader3.takeBook(book1, book2, book3);

        reader1.returnBook(1);
        reader2.returnBook("Java программирование, Шилдт");
        reader3.returnBook(book3);


    }

    private static void printReaders (Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println(reader.getInfo());
        }
        System.out.println();
    }

    private static void printBooks (Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

}