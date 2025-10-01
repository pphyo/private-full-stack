package com.cdv;

public class OperatorApp {

    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, 4, 5, 3, 2 };
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];

            System.out.println("%d loop: %d".formatted(i + 1, result));
        }

        System.out.println("The unique number is " + result);
    }

}