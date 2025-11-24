package tech.codoverse;

public class RobotWorker implements Workable {

    @Override
    public void work() {
        IO.println("Robot works.");
    }

}
