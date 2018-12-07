public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new SmallBoat(), new Train()};
        for (Vehicle v : vehicles) {
            v.start();
        }

        int i = 1;
        System.out.println(i);
        int x = i++;
        System.out.println("x = " + x);
        System.out.println("i = " + i);

        int j = 1;
        int y = ++j;
        System.out.println("y = " + y);
        System.out.println("j = " + j);


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
