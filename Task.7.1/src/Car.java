public class Car extends Vehicle {

    @Override
    double getFuelNeeds() {
        return 100;
    }

    @Override
    double getDistance() {
        return 500;
    }

    public Car(String name) {
        super(name);
    }

    public Car() {
    }
}
