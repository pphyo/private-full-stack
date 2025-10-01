package com.cdv;

public class VariablesApp {

    // members called methods and variables in class
    // way to access members => [owner].[member]

    static boolean boolVal = true;
    static char charVal = '\u102a';
    static int intVal = 100;
    static double doubleVal = 10.44;
    static String strVal = "This is a text";
    int nonStatic;

    public static void main(String[] args) {

        System.out.println("""
                Bool: %s
                Char: %c
                Intr: %d
                Doub: %.1f
                Strg: %s
                """.formatted(
                boolVal,
                charVal,
                intVal,
                doubleVal,
                strVal));

        FromAccess.access();

    }

    static void start() {
        int value = 0; // local variable
        System.out.println(value);
    }

}

class FromAccess {

    static void access() {
        System.out.println("""
                Bool: %s
                Char: %c
                Intr: %d
                Doub: %.1f
                Strg: %s
                """.formatted(
                VariablesApp.boolVal,
                VariablesApp.charVal,
                VariablesApp.intVal,
                VariablesApp.doubleVal,
                VariablesApp.strVal));
    }

}