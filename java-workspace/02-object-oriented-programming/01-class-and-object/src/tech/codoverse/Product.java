package tech.codoverse;

// want to create object
// want to create utility class
public class Product {

    static int count;
    String name;
    int stock;

    void display() {
        System.out.println("""
                Id: %d
                Name: %s
                Stock: %d
                """.formatted(count, name, stock));
    }

}
