public class Test {

    public int countNumbersDividableBy(int divisor, int firstNumber, int lastNumber) {

        int result = 0;
        for (int i = firstNumber; i <= lastNumber; i++) {
            if (i%divisor == 0) {
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Test test = new Test();

        System.out.println(test.countNumbersDividableBy(7, 1456, 2488));
        System.out.println(test.countNumbersDividableBy(7, 1, 21));
        System.out.println(test.countNumbersDividableBy(13, 14, 45));
        System.out.println(test.countNumbersDividableBy(43, 43, 85));

    }
}
