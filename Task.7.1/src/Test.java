public class Test {
    public static void main(String[] args) {
        Vehicle [] vehicles = new Vehicle[5];
        vehicles[0] = new Car("Subaru");
        vehicles[1] = new Truck("Tata");
        vehicles[2] = new Plane("Falcon");
        vehicles[3] = new Ship("Santa Maria");
        vehicles[4] = new RaceCar("Maserati");

        for (Vehicle v : vehicles) {
            System.out.println(v.calculateFuelConsumption());
            v.go();
            v.stop();
            if (v instanceof Plane) {
                ((Plane) v).callAirControl();
            }
        }
    }
}
