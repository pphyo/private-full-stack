package tech.codoverse;

public abstract class Cannie implements CanRun, CanSwim {

    private String color;
    private int legs;

    public Cannie(String color, int legs) {
        this.color = color;
        this.legs = legs;
    }

    @Override
    public void run() {
        IO.println("Cannie runs.");
    }

    public String getColor() {
        return color;
    }

    public int getLegs() {
        return legs;
    }

}
