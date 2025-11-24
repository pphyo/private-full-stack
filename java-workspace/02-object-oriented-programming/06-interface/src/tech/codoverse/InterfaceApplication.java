package tech.codoverse;

interface SmartDevice {
    void doThing();

    default void connect() {
        IO.println("Connecting as a generic smart device...");
    }

}

interface CameraDevice extends SmartDevice {
    @Override
    default void connect() {
        IO.println("Connecting camera features to network...");
    }
}


interface PhoneDevice extends SmartDevice {
    @Override
    default void connect() {
        IO.println("Connecting phone features to network...");
    }
}

interface SmartPhone extends CameraDevice, PhoneDevice {
    @Override
    default void connect() {
        PhoneDevice.super.connect();
    }
}


class Vivo implements SmartPhone {
    @Override
    public void doThing() {
        IO.println("Vivo does something..");
    }
}

public class InterfaceApplication {
    void main() {
        var vivo = new Vivo();
        vivo.connect();
    }
}
