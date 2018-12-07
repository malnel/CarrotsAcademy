public class Truck extends Car {

    public Truck(String name) {
        super(name);
    }

    public Truck() {
    }

    @Override
    double getFuelNeeds() {
        return 200;
    }
}
