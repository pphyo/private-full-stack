package tech.codoverse.entity;

public class Student {

    // method, variable, block, constructor, nested class
    private String name;
    private int age;
    private boolean fresher;
    private int[] marks;
    private double avgMark;

    // Constructor overloading
    public Student() {
        System.out.println("Default constructor.");
        super();
    }

    public Student(String name) {
        this();
        if (name.isBlank()) {
            throw new RuntimeException("Name cannot be empty!");
        }
        System.out.println("1 arg constructor");
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);
        System.out.println("2 args constructors");
        this.age = age;
    }

    public Student(String name, int age, boolean fresher) {
        this(name, age);
        System.out.println("3 args constructors");
        this.fresher = fresher;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // setter or mutator // variable hiding
    public void setName(String name) {
        for (var c : name.toCharArray()) {
            if (!Character.isWhitespace(c) && !Character.isAlphabetic(c)) {
                throw new RuntimeException("Name must be only with alphabet character!");
            }
        }
        this.name = name;
    }

    // getter or accessor
    public String getName() {
        return name;
    }

    public boolean isFresher() {
        return fresher;
    }

    public void setFresher(boolean fresher) {
        this.fresher = fresher;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }

}
