package tech.codoverse.overload;

public class Calculator {

    // method overload
    // must be same method name and return type
    // must be different parameter list

    public double calculate() {
        System.out.println("no arg");
        return 0;
    }

    public double calculate(byte val) {
        System.out.println("with byte");
        return 0;
    }

    public double calculate(short val) {
        System.out.println("with short");
        return 0;
    }

    public double calculate(int val) {
        System.out.println("with int");
        return 0;
    }

    public double calculate(long val) {
        System.out.println("with long");
        return 0;
    }

    public double calculate(int i, long l) {
        return 0;
    }

    public double calculate(long l, int i) {
        return 0;
    }

}
