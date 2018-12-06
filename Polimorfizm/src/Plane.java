public class Plane extends Vehicle {

    @Override
    public void start() {
        System.out.println("Fly");
    }

    public void land() {
        System.out.println("landing");
    }
}
