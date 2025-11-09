package tech.codoverse;

public class EngineCar extends MotorCar {

	public EngineCar() {}

	public EngineCar(String model, int year) {
		super(model, year);
	}

	@Override
	public void start() {
		IO.println("EngineCar is started...");
	}

}