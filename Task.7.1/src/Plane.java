public class Plane extends Vehicle implements Flying {

    @Override
    double getFuelNeeds() {
        return 5000;
    }

    @Override
    double getDistance() {
        return 6000;
    }


    @Override
    public void takeOff() {
        System.out.println("Samolot wzbił się w powietrze");
    }

    @Override
    public void land() {
        System.out.println("Samolot wylądował");
    }

    @Override
    public void callAirControl() {
        System.out.println("Zgłoś się do wieży");
    }

    @Override
    public void go() {
        super.go();
        this.takeOff();
    }

    @Override
    public void stop() {
        super.stop();
        this.land();
    }

    public Plane(String name) {
        super(name);
    }
}
