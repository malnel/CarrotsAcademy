public class RaceCar extends Car {

    public RaceCar(String name) {
        super(name);
    }

    public RaceCar() {
    }

    @Override
    double getFuelNeeds() {
        return 400;
    }
}
