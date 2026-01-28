package tech.codoverse.model.entities;

public class Category extends BaseEntity {

    private String name;

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
