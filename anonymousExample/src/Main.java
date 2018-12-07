public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle() {
            @Override
            public void start() {
                System.out.println("Hello from car");
            }
        };
    }
}

static void useVehicle(Vehicle v) {
    v.start();
}

interface Vehicle {
    void start();
}


