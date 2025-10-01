package tech.codoverse;

import java.io.Console;

public class GradingSystemApp {

    static Console console = System.console();

    public static void main(String[] args) {
        launch();
    }

    static void launch() {
        String name = readString("Enter student name: ");

        System.out.println();

        // check all mark with range of 0 to 100 with looping statement
        int myan = readInt("Enter Myanmar mark: ");
        int eng = readInt("Enter English mark: ");
        int math = readInt("Enter Maths mark: ");
        int che = readInt("Enter Chemistry mark: ");
        int phy = readInt("Enter Physics mark: ");
        int bio = readInt("Enter Biology mark: ");

        System.out.println();

        int[] marks = new int[] { myan, eng, math, che, phy, bio };

        // if pass or fail or distinctions
        if (checkForFail(marks)) {
            System.out.println("Sorry %s! You failed.%n".formatted(name));
        } else {
            int distinctions = countDistinction(marks);

            if (distinctions > 0) {
                System.out.println("Amazing %s!!! You got %d distinction%s.%n".formatted(name, distinctions, distinctions > 1 ? "s" : ""));
            } else {
                System.out.println("Congratulations %s! You passed.%n".formatted(name));
            }
        }

    }

    static boolean checkForFail(int[] marks) {
        if (marks.length != 6) {
            throw new RuntimeException("Please provide exactly 6 subjects!");
        }

        for (int mark : marks)
            if (mark < 40)
                return true;

        return false;
    }

    static boolean checkForPass(int[] marks) {
        return !checkForFail(marks);
    }

    static int countDistinction(int[] marks) {
        if (marks.length != 6) {
            throw new RuntimeException("Please provide exactly 6 subjects!");
        }

        final int[] subjectDistMarks = { 75, 75, 80, 80, 80, 75 };

        int distinctions = 0;

        for (int i = 0; i < marks.length; i++)
            if (marks[i] >= subjectDistMarks[i])
                distinctions++;

        return distinctions;
    }

    static String readString(String prompt) {
        return console.readLine(prompt);
    }

    static int readInt(String prompt) {
        return Integer.parseInt(readString(prompt));
    }

    static String readPass(String prompt) {
        return new String(console.readPassword(prompt));
    }

}