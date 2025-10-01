package tech.codoverse;

public class RomanToIntegerApp {

    public static void main(String[] args) {
        System.out.println(convert("III"));
        System.out.println(convert("LVIII"));
        System.out.println(convert("MCMXCIV"));
    }

    // MCMXCIV
    static int convert(String roman) {
        int result = 0;
        int n = roman.length();
        for (int i = 0; i < n; i++) {
            int value = getValue(roman.charAt(i));

            if (i < n - 1 && value < getValue(roman.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }
        }

        return result;
    }

    // I             1
    // V             5
    // X             10
    // L             50
    // C             100
    // D             500
    // M             1000
    static int getValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}