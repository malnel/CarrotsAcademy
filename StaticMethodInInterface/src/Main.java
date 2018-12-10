import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

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
        Vehicle v4 = new Vehicle() {
            @Override
            public void start() {
                System.out.println("Inna implementacja");
            }
        };

        Vehicle[] vehicles = {v1, v2, v3, v4};

        Vehicle.startVehicles(vehicles);

        Properties p = System.getProperties();
        p.list(System.out);

        System.out.println();
        System.out.println();

        String[] fruitTable = {"apple", "pear", "plum"};

        List<String> fruits = new ArrayList<>(Arrays.asList(fruitTable));
        fruits.add("mango");
        System.out.println(fruits);

        List<String> fruitList = Arrays.asList(fruitTable);
        //fruitList.add("banana"); nie da się tego wykonać
        System.out.println(fruitList);


    }
}

interface Vehicle {
    void start();

    static void startVehicles(Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Pojazd wystartował");
    }
}


