package tech.codoverse;

public class SubstractionFeature extends AbstractCalculationFeature {

    public SubstractionFeature() {
        super(2, "Substraction");
    }

    @Override
    public void calculate(int d1, int d2) {
        IO.println(getFeatureName() +  " result: " + (d1 - d2));
    }

}
