package tech.codoverse;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FuncCalcApp {

    void main() {

        Function<Operator, BiFunction<Double, Double, Double>> func = ope -> {
            return switch (ope) {
                case ADD -> (a, b) -> a + b;
                case SUB -> (a, b) -> a - b;
                case MUL -> (a, b) -> a * b;
                case DIV -> (a, b) -> a / b;
                default -> throw new IllegalArgumentException();
            };
        };

        var a = 20.0;
        var b = 12.0;
        var operator = Operator.SUB;
        var symbol = operator.symbol();
        var biFunc = func.apply(operator);
        var result = biFunc.apply(a, b);
        IO.println("%.1f %s %.1f = %.1f".formatted(a, symbol, b, result));
    }

}
