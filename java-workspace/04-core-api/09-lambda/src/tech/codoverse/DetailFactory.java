package tech.codoverse;

@FunctionalInterface
public interface DetailFactory {

    Student create(String name, int age);

}
