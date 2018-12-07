public class Ship extends Vehicle implements Sailing {

    @Override
    public void dock() {
        System.out.println("Przybyto do portu");
    }

    @Override
    public void stop() {
        super.stop();
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
