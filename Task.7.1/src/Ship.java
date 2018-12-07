public class Ship extends Vehicle implements Sailing {

    @Override
    public void stop() {
        super.stop();
        this.dock();
    }

    @Override
    double getFuelNeeds() {
        return 3000;
    }

    @Override
    double getDistance() {
        return 4000;
    }

    public Ship(String name) {
        super(name);
    }
}
