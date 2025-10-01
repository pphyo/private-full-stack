package com.cdv;

public class DataTypesApp {
    public static void main(String[] args) {

        // byte, short, int, long (integer types)
        byte byteValue = /* (byte) */ 100; // 8 bit (-128 ... 0 ... 127)
        short shortValue = /* (short) */ 130; // 16 bit
        int intValue = 170; // 32 bit - default
        long longValue = 200L; // 64 bit

        // shortValue = /* (short) */ byteValue; // ok => up or implicit cast
        intValue = /* (int) */ shortValue; // ok

        byteValue = (byte) shortValue; // down or explicit cast

        System.out.println("""
                Byte value: %s
                Short value: %s
                Int value: %s
                Long value: %s
                    """.formatted(byteValue, shortValue, intValue, longValue));

        float floatValue = 30.0f; // 32 bit
        double doubleValue = 40.0d; // 64 bit - default

        System.out.println(floatValue);
        System.out.println(doubleValue);

        double result = byteValue + shortValue + intValue + longValue + floatValue + doubleValue;

        System.out.println("Result: " + result);

    }
}
