package tech.codoverse;

public class HumanWorker implements Workable, Eatable {

    @Override
    public void work() {
        IO.println("Human works.");
    }

    @Override
    public void eat() {
        IO.println("Human eats.");
    }

}
