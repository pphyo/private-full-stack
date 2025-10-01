package com.cdv.support;

import java.util.Scanner;

public class AppSupport {
    private static final Scanner sc = new Scanner(System.in);

    public static String readStr(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static int readInt(String message) {
        return Integer.parseInt(readStr(message));
    }

    public static void close() {
        sc.close();
    }
}
