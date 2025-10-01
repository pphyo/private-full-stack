package com.cdv;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class StatementApp {

    public static void main(String[] args) {
        nestedForStatement();
    }


    // branching statement => break, return, continue

    static void nestedForStatement() {
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i + j) % 3 == 0 || (i + j) % 4 == 0) {
                    continue outer;
                }
                System.out.println("i: %d | j : %d".formatted(i, j));
            }
            System.out.println();
        }
    }

    static void enhancedForStatement(String[] args) {

        for (int i = 0; i < args.length; i = i + 2) {
            System.out.println(args[i]);
        }

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        for (int num : numbers)
            System.out.println(num);
    }

    static void basicForStatement() {
        AtomicInteger i = new AtomicInteger(0); // counter
        for (System.out.println("Initializing..."); getBool(i.get()); updateCounter(i)) {
            System.out.println("Body executed: " + i.get());
        }
    }

    static void updateCounter(AtomicInteger counter) {
        System.out.println("Update statement executed.");
        counter.incrementAndGet();
    }

    static boolean getBool(int i) {
        System.out.println("Bool expression executed.");
        return i < 5;
    }

    static void doWhileStatement() {
        Scanner sc = new Scanner(System.in);

        int counter = 0;

        do {
            System.out.print("Enter text: ");
            String text = sc.nextLine();
            System.out.println(text);

            counter++;
            System.out.println();
        } while (counter < 10);

        sc.close();
    }

    static void whileStatement(int number) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        if(number > 10)
            while (flag) {
                System.out.println();

                System.out.print("Enter text: ");
                String text = sc.nextLine();
                System.out.println(text);

                if (text.equalsIgnoreCase("exit")) {
                    flag = false;
                }
            }
        else
            System.out.println("Requirement not met!");

        sc.close();
    }

    // Only int values, strings, and enums are permitted in swith case.
    static String switchExpressionTwo(int number) {
        return switch (number) {
            case 0 -> {
                // any other statment ...
                // multiple statement in switch expression with arrow operator
                yield "Zero";
            }
            case 1, 2, 3, 4 -> "Small number"; // single statement in switch expression with arrow operator
            case 5, 6, 7, 8, 9 -> "Large number";
            default -> "Wrong number";
        };
    }

    static String switchExpressionOne(int number) {
        String result = switch (number) {
            case 0:
                yield "Zero";
            case 1, 2, 3, 4:
                yield "Small number";
            case 5, 6, 7, 8, 9:
                yield "Large number";
            default:
                yield "Wrong number";
        };

        return result;
    }

    static void switchStatement(int number) {
        switch (number) {
            default:
                System.out.println("Wrong number");
                break;
            case 0:
                System.out.println("Zero.");
                break;
            case 1, 2, 3, 4:
                Scanner sc = new Scanner(System.in);
                do {
                    System.out.print("Enter text: ");
                    String text = sc.nextLine();
                    System.out.println(text);

                    if (text.equalsIgnoreCase("exit")) {
                        break;
                    }

                    System.out.println();
                } while (true);
                break;
            case 5, 6, 7, 8, 9:
                System.out.println("Large number.");
                break;
        }

        System.out.println("Terminated...");
    }

    static void ifElseIfElseStatement(int number) {
        if (number == 0) {
            System.out.println("Zero");
        } else if(number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        }
    }

    static void ifElseStatement(String who) {
        if (null == who || who.isBlank()) {
            System.out.println("Provide a name!");
        } else {
            System.out.println("Hello " + who);
        }
    }

    static void ifStatement(int num) {
        if (num == 10)
            System.out.println("Number is greater than 10.");

        System.out.println("If block.");
        System.out.println("Terminated.");
    }
}