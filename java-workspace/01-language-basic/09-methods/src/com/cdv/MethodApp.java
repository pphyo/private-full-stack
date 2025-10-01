package com.cdv;

public class MethodApp {

    public static void main(String[] args) {
        // method invoking
        // String message = "Hello from main";
        // start(message); // message in here is argument

        String greeting = greetBefore() + greetAfter("Charity");
        System.out.println(greeting);

    }

    static boolean isEven(int num) {
        if (num % 2 == 0) {
            System.out.println("statement before return in if.");
            return true; // branching statment
            // System.out.println("statement after return in if."); unreachable code
        }

        System.out.println("statement before return in else.");
        return false;

        // return num % 2 == 0;
    }

    // method definition
    static void start(String message) { // message is parameter
        System.out.println(message);
    }

    static String greetBefore() {
        System.out.println("greetBefore() is invoked.");
        return "Hello ";
    }

    static String greetAfter(String who) {
        System.out.println("greetAfter() is invoked.");
        return who;
    }
}
