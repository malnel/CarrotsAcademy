public abstract class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle() {
    }

    abstract double getFuelNeeds();

    abstract double getDistance();

    double calculateFuelConsumption() {
        return getDistance() / getFuelNeeds();
    }

    public void go() {
        System.out.println("Uruchomiono: " + this.getClass().getName());
    }

    public void stop() {
        System.out.println("Zatrzymano: " + this.getClass().getName());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
