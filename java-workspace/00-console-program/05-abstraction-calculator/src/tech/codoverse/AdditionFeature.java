package tech.codoverse;

public class AdditionFeature extends AbstractCalculationFeature {

    public AdditionFeature() {
        super(1, "Addition");
    }

    @Override
    public void calculate(int d1, int d2) {
        IO.println(getFeatureName() +  " result: " + (d1 + d2));
    }

}
