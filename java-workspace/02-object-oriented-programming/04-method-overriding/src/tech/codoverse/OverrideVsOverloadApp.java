import tech.codoverse.*;

void main() {
    A a = new A();
    B b = new B();

    a = b;

    IO.println("%s %s".formatted(a, b));

    execute(a);
}

void execute(A a) {
    a.doWork();
    IO.println("A version");
}

void execute(B b) {
    b.doWork();
    IO.println("B version");
}

class A {
    void doWork() {
        IO.println("doWork() in A");
    }
}

class B extends A {
    @Override
    void doWork() {
        IO.println("doWork() in B");
    }
}