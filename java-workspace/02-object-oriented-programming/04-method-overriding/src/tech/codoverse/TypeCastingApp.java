import tech.codoverse.*;

void main() {
    Train train = new Train(null, 0);
    Vehicle veh = new MotorCar();

    if (veh instanceof Train) {
        // ElectricCar evCar = (ElectricCar) veh;
        // car.fillFuel();
        IO.println("instanceof");
    }

    IO.println("Program ends.");
}