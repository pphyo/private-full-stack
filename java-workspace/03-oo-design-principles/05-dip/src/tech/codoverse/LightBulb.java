package tech.codoverse;

public class LightBulb implements Switchable {

    public void turnOn() {
        IO.println("Lights on.");
    }

    public void turnOff() {
        IO.println("Lights off.");
    }

}
