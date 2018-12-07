public class Triangle implements RegularShape {

    private double a;

    public Triangle(double a) {
        this.a = a;
    }



    @Override
    public double getArea() {
        return Math.sqrt(3) * a * a / 2;
    }

    @Override
    public double getCircumference() {
        return 3 * a;
    }
}
