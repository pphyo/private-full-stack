package tech.codoverse;

public class Fan implements Switchable {

    @Override
    public void turnOn() {
        IO.println("Fan on.");
    }

    @Override
    public void turnOff() {
        IO.println("Fan off.");
    }

}
