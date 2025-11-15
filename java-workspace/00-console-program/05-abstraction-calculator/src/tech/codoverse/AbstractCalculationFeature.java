package tech.codoverse;

public abstract class AbstractCalculationFeature extends AbstractFeature {

    public AbstractCalculationFeature(int id, String feautreName) {
        super(id, feautreName);
    }

    @Override
    public void doBusiness() {
        // get digit one
        var d1 = getDigitOne();

        // get digit two
        var d2 = getDigitTwo();

        IO.println();;
        // show result
        calculate(d1, d2);
        IO.println();
    }

    public abstract void calculate(int d1, int d2);

    private int getDigitOne() {
        return Integer.parseInt(IO.readln("Digit one: "));
    }

    private int getDigitTwo() {
        return Integer.parseInt(IO.readln("Digit two: "));
    }

}
