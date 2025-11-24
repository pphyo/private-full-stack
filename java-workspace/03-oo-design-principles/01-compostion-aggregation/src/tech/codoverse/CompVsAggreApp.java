package tech.codoverse;

public class CompVsAggreApp {
    void main() {
        var book = new Book();
        var lib = new Library(book);

        IO.println("Library: " + lib);
        IO.println("Book: " + book);

        lib = null;

        IO.println("Library again: " + lib);
        IO.println("Book again: " + book);
    }
}
