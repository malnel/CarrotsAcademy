public class TestYear {

    public boolean isLeapYear(int year) {
        boolean result = false;
        if (year%400==0 || (year%4 == 0 && year%100!=0)) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        TestYear ty = new TestYear();


        System.out.println("2016 is a leap year: " + ty.isLeapYear(2016));
        System.out.println("2017 is a leap year: " + ty.isLeapYear(2017));
        System.out.println("1845 is a leap year: " + ty.isLeapYear(1845));
        System.out.println("1846 is a leap year: " + ty.isLeapYear(1846));
        System.out.println("1848 is a leap year: " + ty.isLeapYear(1848));
    }



}
