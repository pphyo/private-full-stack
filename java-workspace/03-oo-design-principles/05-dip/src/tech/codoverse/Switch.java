package tech.codoverse;

public class Switch {

    private boolean on;
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    void toggle() {
        on = !on;
        if (on) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

}
