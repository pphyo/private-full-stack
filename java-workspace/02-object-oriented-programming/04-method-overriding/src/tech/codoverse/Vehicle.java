package tech.codoverse;

public class Vehicle {

	private String model;
	public int year = 2000;

	public Vehicle() {}

	public Vehicle(String model, int year) {
		this.model = model;
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public void start() {
		IO.println("Vehicle is started...");
	}

	public void stop() {
		IO.println("Vehicle is stopping...");
	}

}