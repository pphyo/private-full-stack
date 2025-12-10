package tech.codoverse.java.models.domain;

public enum Grade {

    G_ONE("G-1"),
    G_TWO("G-2"),
    G_THREE("G-3"),
    G_FOUR("G-4"),
    G_FIVE("G-5"),
    G_SIX("G-6"),
    G_SEVEN("G-7"),
    G_EIGHT("G-8"),
    G_NINE("G-9");

    private String label;

    private Grade(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }

}
