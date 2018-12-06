package pl.akademia;

public class DomesticTrip extends Trip {

    double ownArrivalDiscount;

    public DomesticTrip(Date start, Date end, String destination, double price) {
        super(start, end, destination, price);
    }

    public DomesticTrip(Date start, Date end, String destination, double price, double ownArrivalDiscount) {
        super(start, end, destination, price);
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    public void setOwnArrivalDiscount(double ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public double getPrice() {
        return super.getPrice() - ownArrivalDiscount;
    }
}
