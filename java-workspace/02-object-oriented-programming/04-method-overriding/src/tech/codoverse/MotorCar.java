package tech.codoverse;

public class MotorCar extends Vehicle {

	public int year = 2010;

	public MotorCar() {}

	public MotorCar(String model, int year) {
		super(model, year);
	}

	@Override
	public void start() {
		IO.println("MotorCar Year: " + year);
		IO.println("Vehicle Year: " + super.year);
		IO.println("MotorCar started...");
	}

	public void fillFuel() {
		IO.println("MotorCar's fuel is filling...");
	}

}