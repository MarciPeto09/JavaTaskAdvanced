package exeptionsTask;

import java.util.*;

public class BookRepository {

    List<Book> listBook = new ArrayList<>();

    public void addBook(Book book) throws NoBookFoundException{
        this.addBook(book);
    }

    public void removeBook(Book book) throws NoBookFoundException{
        this.removeBook(book);
    }

    public Book kerkoEmer(String emer) throws NoBookFoundException{
        for (Book book : listBook) {
            if (book.getTitle().equals(emer)) {
                return book;
            }
        }throw new NoBookFoundException("Can't delete book with id: " + emer);
    }

    public Book kerkoId(String id) throws NoBookFoundException{
        for (Book book : listBook) {
            if (book.getId().equals(id)){
                return book;
            }
        } throw new NoBookFoundException("Can't find book with isbn:" + id);
    }
    public void removeBookFromId(String id, Book book) throws NoBookFoundException{
        if (book.getId().equals(id)) {
            this.removeBook(book);
        }

    }
}
