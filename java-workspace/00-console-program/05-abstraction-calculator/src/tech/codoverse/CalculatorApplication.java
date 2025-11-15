package tech.codoverse;

public class CalculatorApplication {

    void main() {
        var console = new ConsoleCalculator(
                    "Console Calculator",
                            new AbstractFeature[] {
                                new AdditionFeature(),
                                new SubstractionFeature()
                             }
        );

        console.launch();
    }

}
