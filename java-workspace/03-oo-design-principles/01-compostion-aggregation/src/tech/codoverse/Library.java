package tech.codoverse;

public class Library {

    private String name;
    private Book book;

    public Library(Book book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }
}
