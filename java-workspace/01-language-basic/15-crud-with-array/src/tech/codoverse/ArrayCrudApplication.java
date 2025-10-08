package tech.codoverse;

public class ArrayCrudApplication {

    public static void main(String[] args) {
        run();
    }

    static void run() {
        ArrayCrud app = new ArrayCrud();

        app.addLast(5);
        app.addLast(12);
        app.update(1, 21);
        app.addLast(42);
        app.addLast(37);
        app.addLast(-19);

        app.display();

        app.delete(2);
        app.delete(2);

        app.display();
    }

}