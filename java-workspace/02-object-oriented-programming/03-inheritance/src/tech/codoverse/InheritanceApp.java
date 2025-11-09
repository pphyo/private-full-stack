package tech.codoverse;

import tech.codoverse.pkg.ChildFromDiffPkg;
import tech.codoverse.services.AppService;

public class InheritanceApp {

    public InheritanceApp(String text) {
        if (text.isBlank()) {
            throw new IllegalArgumentException("");
        }
        var service = new AppService();
        service.greet("text");
        super();
        IO.println(hashCode());
    }

    public static void main(String[] args) {

        // ChildInSamePkg samePkg = new ChildInSamePkg();
        // samePkg.doWork();
        // IO.println(samePkg.name);
        // IO.println(samePkg.count);
        // samePkg.countUp();

        // IO.println();

        ChildFromDiffPkg diffPkg = new ChildFromDiffPkg("");
        diffPkg.doWork();
        IO.println(diffPkg.name);
        IO.println(ChildFromDiffPkg.count);
        // ChildFromDiffPkg.countUp();

    }
}