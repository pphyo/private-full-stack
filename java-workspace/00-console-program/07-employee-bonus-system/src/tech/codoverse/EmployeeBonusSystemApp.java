package tech.codoverse;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EmployeeBonusSystemApp {

    void main() {
        Supplier<List<Employee>> dbLoader = () -> {
            List<Employee> list = new ArrayList<>();
            list.add(
                    new Employee(
                            "David Musser",
                            500000,
                            "Junior Dev"));
            list.add(
                    new Employee(
                            "Jack Bryan",
                            1200000,
                            "Senior Dev"));

            list.add(
                    new Employee(
                            "Amelia",
                            2000000,
                            "Manager"));

            list.add(
                    new Employee(
                            "Stephane",
                            400000,
                            "Intern"));

            return list;
        };

        Predicate<Employee> isEligibleForBonus = emp -> emp.getSalary() > 600000;
        Function<Employee, Double> calculateBonus = emp -> emp.getSalary() * 0.1;

        Consumer<String> reportPrinter = msg -> IO.println(">>> Report: " + msg);

        IO.println("--- START BONSU CALCULATION ---");

        List<Employee> employees = dbLoader.get();

        for (Employee emp : employees) {
            if (isEligibleForBonus.test(emp)) {
                double bonusAmount = calculateBonus.apply(emp);
                String message = String.format("%s gets bonous: %.0f MMK", emp.getName(), bonusAmount);
                reportPrinter.accept(message);
            } else {
                IO.println(emp.getName() + " is NOT eligible.");
            }
        }
    }

}
