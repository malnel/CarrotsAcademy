package workshop.tests.exercises;

import workshop.tests.exercises.workshop.tests.exercises.service.MathService;

public class MathApp {

    private MathService mathService;

    public int multiplyAndAdd(int a, int b, int c) {
        return mathService.multiply(a, b) + c;
    }

    public int divideAndAdd(MathService mathService, int c) {
        return mathService.divide() / c;
    }
}
