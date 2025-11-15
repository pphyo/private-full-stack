package tech.codoverse;

// all the things in concrete class and abstract method
public abstract class Animal {

    // public static int static_var = 100;
    // int inst_var = 200;

    // static {IO.println("static block");}

    // { IO.println("instance block");}

    // public static void stMethod() {}

    // public void instMethod() {}

    private String color;

    public Animal() {
        IO.println("constructor");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void move();

}
