package exeptionsTask;

import java.util.*;

public class MainBook {
    public static void main(String[] args) throws NoBookFoundException{
        BookRepository bookRepository = new BookRepository();
        bookRepository.addBook(new Book("A","Libri1","Ana",2000));
        bookRepository.addBook(new Book("B","Libri2","Bana",2009));

        Book book1 = bookRepository.kerkoId("A");



    }
}
