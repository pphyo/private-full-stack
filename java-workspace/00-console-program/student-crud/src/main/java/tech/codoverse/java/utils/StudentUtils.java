package tech.codoverse.java.utils;

public class StudentUtils {

    public static void checkIndex(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("The index %d you search not found.".formatted(index));
        }
    }

}
