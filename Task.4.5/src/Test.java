public class Test {

    public int countPrimeNumbers(int firstNumber, int lastNumber) {

        int numberOfDivisors;
        int result = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            numberOfDivisors = 0;

            for (int j = 1; j<=i; j++) {
                if (i%j==0) {
                    numberOfDivisors++;
                }
            }

            if (numberOfDivisors==2) {
                result++;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        Test t = new Test();

        System.out.println(t.countPrimeNumbers(5, 17));
    }
}
