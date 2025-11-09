package tech.codoverse;

public class ElectricCar extends MotorCar {

	public ElectricCar() {}

	public ElectricCar(String model, int year) {
		super(model, year);
	}

	@Override
	public void start() {
		IO.println("ElectricCar is started...");
	}

	public void charge() {
		IO.println("ElectricCar is charging...");
	}

}