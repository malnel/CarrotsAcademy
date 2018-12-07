public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new SmallBoat(), new Train()};
        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}

abstract class Vehicle {
    void start() {
        startEngine();
        horn();
        move();
    }

    void move() {
        System.out.println("Rusza pojazd");
    }
    abstract void horn();

    void startEngine() {
        System.out.println("Uruchomiono silnik");
    }

}

abstract class Ship extends Vehicle {
}

class SmallBoat extends Ship {
    @Override
    void horn() {
        System.out.println("######### dźwięk syreny okrętowej");
    }
}

class Train extends Vehicle {
    @Override
    void horn() {
        System.out.println("++++++gwizd lokomotywy");
    }
}