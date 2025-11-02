package tech.codoverse;

import tech.codoverse.services.AppService;

public class InheritanceApp {

    public InheritanceApp(String text) {
        if (text.isBlank()) {
            throw new IllegalArgumentException("");
        }
        var service = new AppService();
        service.greet("text");
        super();
        System.out.println(hashCode());
    }

    public static void main(String[] args) {
        var app = new InheritanceApp("");
        System.out.println(app);
    }
}