public class RegularShapeHelper {

    public static void printShapeInfo(RegularShape s) {
        String name = s.getClass().getSimpleName();
        double circ = s.getCircumference();
        double area = s.getArea();
        System.out.printf("%8s [circ. = %5.2f, area = %5.2f]%n", name, circ, area);
    }
}
