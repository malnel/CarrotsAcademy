public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Car();
        Vehicle v3 = new Vehicle() {
            @Override
            public void start() {
                System.out.println("Anonimowa implementacja");
            }
        };
        Vehicle[] vehicles = {v1, v2, v3};

        Vehicle.startVehicles(vehicles);
    }
}

interface Vehicle {
    void start();

    static void startVehicles(Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            v.start();
        }
    };
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Pojazd wystartował");
    }
}


