package tech.codoverse.entity;

public class MotorCycle {

    public static double overallDistanceKm;
    private String model;
    private String color;
    private int modelYear;

    static {
        System.out.println("static block ran.");
    }

    {
        System.out.println("instance block ran.");
    }

    public MotorCycle(String model, String color, int modelYear) {
        System.out.println("Before super()");

        super();

        System.out.println("After super()");

        this.model = model;

        this.color = color;

        this.modelYear = modelYear;

        System.out.println(getClass().getName() + "'s constructor is called.");

    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getModelYear() {
        return modelYear;
    }

}
