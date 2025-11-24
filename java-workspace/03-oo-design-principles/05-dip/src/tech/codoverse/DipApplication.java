package tech.codoverse;

public class DipApplication {

    void main() {
        Switch s = new Switch(new Fan());
        s.toggle();
        s.toggle();
    }

}
