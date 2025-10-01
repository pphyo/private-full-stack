package com.cdv;

public class HelloWithMain {
    public final synchronized static void main(String[] args) {
        for (var arg : args) {
            System.out.println(arg);
        }
    }

}

class A {
}

class B {
}