public class Circle implements RegularShape {

    private double d;

    public Circle(double d) {
        this.d = d;
    }

    @Override
    public double getArea() {
        return Math.PI * d * d / 4;
    }

    @Override
    public double getCircumference() {
        return Math.PI * d;
    }
}
