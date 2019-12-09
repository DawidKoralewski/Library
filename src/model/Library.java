package model;



public class Library {

    private final int maxBook = 1000;
    private Book[] books = new Book[maxBook];
    private int booksNumber;


    public void addBooks(Book book) {
        if (booksNumber < maxBook) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("osiągnięto maksymalną liczbę książęk. ");
        }

    }

    public void printBooks() {

        if (booksNumber == 0) {
            System.out.println("biblioteka pusta, dodaj jakieś książki.");
        }
        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }
    }
}
