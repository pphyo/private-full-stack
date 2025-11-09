package tech.codoverse.isa;

// access in top level class just one of two, public and package-private
public class ParentType {

    public String name = "Parent name";
    public static int count = 20;

    static {
        IO.println("static block in ParentType.");
    }

    {
        IO.println("instance block in ParentType.");
    }

    public ParentType(String name) {
        super();}

    public void doWork() {
        IO.println("Parent => doWork()");
    }

    protected void init() {}

    public static void countUp() {
        IO.println("Parent => countUp()");
    }

}
