package pl.akademia;

public class Trip {

    Date start;
    Date end;
    String destination;

    public Trip(Date start, Date end, String destination) {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }

    public String getInfo() {
        return (
                "Destination: " + destination +
                " start: " + start.getInfo() +
                " end: " + end.getInfo());
    }
}
