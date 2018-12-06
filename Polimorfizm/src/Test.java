import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Plane plane1 = new Plane();
        plane1.start();
        plane1.land();

        Vehicle vehiclePlane = new Plane();
        vehiclePlane.start();
        //nie widzi tej metody, bo referencja jest typu vehicle, a nie plane
        //vehiclePlane.land();

        if (vehiclePlane instanceof Plane) {
            ((Plane) vehiclePlane).land();
        }

        Vehicle vehicle = new Vehicle();
        vehicle.start();

        Car car = new Car();
        car.start();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(plane1);
        vehicles.add(vehiclePlane);
        vehicles.add(vehicle);
        vehicles.add(car);

        System.out.println();
        //sprawdzam, czy obiekt klasy Vehicle jest tez obiektem klasy Plane, jesli tak, to wywoluje metode land()
        for (Vehicle v : vehicles) {
            if (v instanceof Plane) {
                ((Plane) v).land();
            }
        }

        System.out.println();
        for (Vehicle v : vehicles) {
            v.start();
        }

    }
}
