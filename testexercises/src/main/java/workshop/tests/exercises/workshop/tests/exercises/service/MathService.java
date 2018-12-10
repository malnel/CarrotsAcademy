package workshop.tests.exercises.workshop.tests.exercises.service;

public class MathService {

    int x;
    int y;

    public int multiply(int a, int b) {
        return a*b;
    }

    public int divide() {
        return this.x / this.y;
    }

    public MathService(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MathService() {
    }
}
