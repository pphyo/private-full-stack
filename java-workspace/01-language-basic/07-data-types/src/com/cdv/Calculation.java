package com.cdv;

import com.cdv.support.AppSupport;

public class Calculation {
    public static void main(String[] args) {

        int x = AppSupport.readInt("Enter x: ");
        int y = AppSupport.readInt("Enter y: ");

        System.out.println("Result: " + (x + y));

    }
}
