package tech.codoverse;

public class Tiger extends Cannie {

    public Tiger(String color, int legs) {
        super(color, legs);
    }

    @Override
    public void swim() {
        IO.println("Tiger swims.");
    }

}
