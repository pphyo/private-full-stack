package tech.codoverse;

import java.util.Arrays;

public class ArrayApplication {

    // byte => Byte
    // short => Short
    // int => Integer
    // long => Long
    // float => Float
    // double => Double
    // char => Character
    // boolean => Boolean

    public static void main(String[] args) {
        copyOfArray();
    }

    static void copyOfArray() {
        int[] array = { 6, -2, 51, 17, 0, -4, 9 };

        int[] newArray = Arrays.copyOf(array, 10);

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Copied Array: " + Arrays.toString(newArray));
    }

    static void fillArray() {
        int[] array = { 6, -2, 51, 17, 0, -4, 9 };

        Arrays.fill(array, 1, 4, 15);

        // for(int i = fromIndex; i < toIndex; i ++) {}

        System.out.println(Arrays.toString(array));
    }

    // [-4, -2, 0, 6, 9, 17, 51]
    static void searchInArray() {
        int[] array = { 6, -2, 51, 17, 0, -4, 9 };

        Arrays.sort(array);

        int foundedIndex = Arrays.binarySearch(array, 3);

        System.out.println(foundedIndex);
    }

    static void sortArray() {
        int[] array = { 6, -2, 51, 17, 0, -4, 9 };

        System.out.println("Before soft: " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("After sort: " + Arrays.toString(array));

    }

    static void multiArray() {
        int[][] twoDi = new int[3][4];

        twoDi[0] = new int[] { 1, 2, 3, 4 };
        twoDi[1] = new int[] { 5, 6, 7, 8 };
        twoDi[2] = new int[] { 9, 10, 11, 12 };

        System.out.println(twoDi.length);
        System.out.println(twoDi[0].length);

        for (int i = 0; i < twoDi.length; i++) {
            for (int j = 0; j < twoDi[i].length; j++) {
                System.out.println(twoDi[i][j]);
            }
        }
    }

    static void initializeArray() {
        int[] intArray;

        // intArray = {1, 2, 3, 4};// implicit initialize
        intArray = new int[] { 1, 2, 3, 4 };

        for (int i : intArray) {
            System.out.println(i);
        }
    }

    static void declareArrayLength() {
        int[] intArr = new int[4];

        System.out.println("Before assigning array");
        System.out.println("======================");
        for (int arr : intArr) {
            System.out.println(arr);
        }

        System.out.println();
        System.out.println("Length: %d".formatted(intArr.length));
        System.out.println();

        intArr[0] = 21;

        System.out.println("""
                After assigned in Array
                ======================""");
        for (int i = 0, length = intArr.length; i < length; i++) {
            System.out.println("Index %d: %d".formatted(i, intArr[i]));
        }
    }

}