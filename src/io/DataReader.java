package io;

import model.Book;

import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);


    public void close() {
        sc.close();
    }

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    public Book readAndCreateBook() {
        System.out.println("Tytuł:");
        String title = sc.nextLine();
        System.out.println("Autor");
        String author = sc.nextLine();
        System.out.println("Wydawnictow");
        String publisher = sc.nextLine();
        System.out.println("ISBN");
        String isbn = sc.nextLine();
        System.out.println("Rok Wydania:");
        int releaseDate = getInt();
        System.out.println("Liczba Stron");
        int pageNumber = getInt();

        return new Book(title, author, releaseDate, pageNumber, publisher, isbn);

    }

}
