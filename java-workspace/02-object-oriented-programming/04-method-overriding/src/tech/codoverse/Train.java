package tech.codoverse;

// Train extends Vehicle
// Train is a Vehicle
// Vechile is a parent, super, base
// Train is a child, sub, derived
public class Train extends Vehicle {

	public Train(String model, int year) {
		super(model, year);
	}

	@Override
	public void start() {
		IO.println("Train is started.");
	}

}