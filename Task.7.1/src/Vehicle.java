public abstract class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    abstract double getFuelNeeds();

    abstract double getDistance();

    double calculateFuelConsumption() {
        return getDistance() / getFuelNeeds();
    }

    public String go() {
        return Object.class.getName();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
