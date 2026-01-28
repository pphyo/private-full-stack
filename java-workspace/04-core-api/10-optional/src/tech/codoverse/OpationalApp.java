package tech.codoverse;

import java.util.Optional;

public class OpationalApp {

    void main() {
        runForUnwrapping();
    }

    void runForUnwrapping() {
        var result = Optional.<Integer>ofNullable(100)
                .orElseGet(() -> 0);

        IO.println(result);

        var throwResult = Optional.<Integer>ofNullable(null)
                .orElseThrow(() -> new IllegalArgumentException("No value"));
        IO.println(throwResult);
    }

    void runForCheckingGetting() {
        Optional<String> optional = Optional.ofNullable(null);
        optional.ifPresentOrElse(this::consume, () -> IO.println("No value"));
    }

    void consume(String value) {
        IO.println(value);
    }

    void runForCreation() {
        var empty = Optional.empty();
        IO.println(empty);

        String value = "Hello Optional";

        var of = Optional.of(value);
        IO.println(of);

        var ofNull = Optional.ofNullable(1000);
        IO.println(ofNull);
    }

}
