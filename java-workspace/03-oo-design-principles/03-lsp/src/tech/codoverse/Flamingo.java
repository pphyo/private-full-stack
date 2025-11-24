package tech.codoverse;

public class Flamingo extends Bird implements CanFly {

    @Override
    public void fly() {
        IO.println("Flamingo flies.");
    }

}
