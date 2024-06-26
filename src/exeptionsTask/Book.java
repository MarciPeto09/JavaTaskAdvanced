package exeptionsTask;

public class Book {
    private String id;
    private String title;
    private String author;
    private int yearOfRelease;

    public Book() {
    }

    public Book(String id, String title, String author, int yearOfRelease) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", isbn=" + id +
                '}';
    }
}
