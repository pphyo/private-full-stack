package tech.codoverse;

public class LspApplication {

    void main() {
        run(new Flamingo());
    }

    void run(Bird b) {
        if (b instanceof CanFly f) {
            f.fly();
        }

        b.sleep();
    }

}
