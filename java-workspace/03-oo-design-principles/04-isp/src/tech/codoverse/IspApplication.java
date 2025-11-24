package tech.codoverse;

public class IspApplication {
    void main() {
        Workable w = new HumanWorker();
        w.work();
        ((HumanWorker) w).eat();
    }
}
