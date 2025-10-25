package tech.codoverse;

import tech.codoverse.entity.Student;

public class ConstructorApp {

    public static void main(String[] args) {
        // create student instance
        var student = new Student("Nilar", 19, false);

        System.out.println(student.getName());

    }

}