package tech.codoverse;

public enum Operator {

    ADD("+"), SUB("-"), MUL("\u00d7"), DIV("\u00f7");

    private final String symbol;

    private Operator(String symbol) {
        this.symbol = symbol;
    }

    public final String symbol() {
        return symbol;
    }

}
