package app;

import io.DataReader;
import model.Book;
import model.Library;

public class LibraryControl {

    //zmienne do kontrolowania programu

    private final int exit = 0;
    private final int addBook = 1;
    private final int printBooks = 2;

    //zmienna do komunikacji z użytkownikiem

    private DataReader dataReader = new DataReader();

    // biblioteka do przechowywania danych

    private Library library = new Library();


    // główna metoda do interkacji z uzytkownikiem

    public void controlLoop() {


        int option;

        do {
            printOptions();

            option = dataReader.getInt();

            switch (option) {

                case addBook:
                    addBook();
                    break;
                case printBooks:
                    printBooks();
                    break;
                case exit:
                    exit();

                    break;
                default:
                    System.out.println("nie ma takiej opcji, wybierz ponownie");

            }

        } while (option != exit);
    }

    private void printOptions() {
        System.out.println("Wybierz opcje: ");
        System.out.println(exit + "wyjście z programu :");
        System.out.println(addBook + "Dodaj książke");
        System.out.println(printBooks + "wydrukuj informacje o książkąch");
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBooks(book);
    }

    private void printBooks() {
        library.printBooks();
    }

    private void exit() {
        System.out.println("koniec programu, papa :)");
        dataReader.close();
    }

}

