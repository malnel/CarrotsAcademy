public class Square implements RegularShape {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getCircumference() {
        return 4 * a;
    }
}
