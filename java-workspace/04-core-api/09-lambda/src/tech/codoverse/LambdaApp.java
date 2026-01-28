package tech.codoverse;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaApp {

    void main() {
        runForUnaryOperator();
    }

    void runForUnaryOperator() {
        UnaryOperator<Integer> unary = i -> ++i;
        IO.println(unary.apply(10));
    }

    void runForPredicate() {
        Predicate<Integer> pred = n -> n % 2 == 0;
        IO.println(pred.test(101));
    }

    void runForFunction() {
        Function<String, Integer> siFunc = Integer::parseInt;
        IO.println(siFunc.apply("10"));

        String usrString = "Bo Bo, 20";

        Function<String, User> suFunc = s -> {
            String[] array = s.split(",");
            User user = new User(array[0], siFunc.apply(array[1].trim()));
            return user;
        };
        IO.println(suFunc.apply(usrString));
    }

    void runForConsumer() {
        Consumer<String> con = s -> IO.println("Hello " + s);
        con.accept("Consumer");
    }

    void runForSupplier() {
        Supplier<String> sup = () -> "Hello suppiler";
        IO.println(sup.get());
    }

    void runForConstRef() {
        EmptyFactory emptyFactory = Student::new;
        IO.println(emptyFactory.create());

        DetailFactory detailFactory = Student::new;
        IO.println(detailFactory.create("Anne", 22));
    }

    // [Owner]::methodName
    void runForMR() {
        TextConverter stCvt = StringUtils::toExclamation;
        IO.println(stCvt.transform("Hello"));

        StringUtils utils = new StringUtils();
        TextConverter instCvt = utils::toQuoted;
        IO.println(instCvt.transform("Instance method reference"));
    }

    void runForAnimalHop() {
        check(a -> a.hop());
    }

    void check(CheckTrait check) {
        var result = check.test(new Animal());
        IO.println(result);
    }

    void runForLambdaIntro() {
        int speed = 10;
        // () -> {}
        Flyable fAnon = new Flyable() {
            @Override
            public void fly() {
                IO.println("Flying");
            }
        };
        fAnon.fly();

        Flyable fLambda = () -> IO.println("Fly in Lambda" + speed);
        fLambda.fly();

        Greetable gAnon = new Greetable() {
            @Override
            public void greet(String who) {
                IO.println("Anon greet");
            }
        };
        gAnon.greet("");

        Greetable gLambda = who -> IO.println("Lambda greet");
        gLambda.greet("");

        Operation opeAnon = new Operation() {
            @Override
            public double operate(int a, int b) {
                return a + b;
            }
        };
        IO.println("Anon ope " + opeAnon.operate(4, 7));

        Operation opeLambda = (a, b) -> a / b;
        IO.println("Lambda ope " + opeLambda.operate(6, 5));
    }

}

@FunctionalInterface
interface TextConverter {
    String transform(String input);
}

interface Flyable {
    void fly();
}

interface Greetable {
    void greet(String who);
}

interface Operation {
    double operate(int a, int b);
}

@FunctionalInterface
interface Worker {
    void work();
}

class Animal {
    public boolean hop() {
        return true;
    }
}

interface CheckTrait {
    boolean test(Animal a);
}