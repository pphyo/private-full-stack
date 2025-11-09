import tech.codoverse.*;

// poly => many
// morphic => form

void main() {

	// Vehicle veh = /*(Vehicle)*/ new Train("Cosmos", 1998); // implicit cast

	// launch(new ElectricCar("Cosmos", 1998));

	EngineCar car = (EngineCar) new Vehicle("", 0); // explicit cast

	// Train train = (Train)new MotorCar("", 0);

	MotorCar veh = new MotorCar();
	veh.start();
	IO.println(veh.year);
}

void launch(Vehicle veh) {
	veh.start();
	veh.stop();
}