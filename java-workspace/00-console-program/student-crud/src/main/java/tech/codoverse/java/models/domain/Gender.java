package tech.codoverse.java.models.domain;

public enum Gender {
    MALE("Male"), FEMALE("Female");

    private String label;

    private Gender(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
