package tech.codoverse;

public class AbstractionApp {

    void main() {
        // create abstract class's object from its child and anonymous inner class
        Animal ani = new Animal() {
            public void move() {
            }
        };
        IO.println(ani);
    }

}