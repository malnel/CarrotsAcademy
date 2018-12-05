public class Test {

    public static void main(String[] args) {

        Date start = new Date(2015, 7, 23);
        Date end = new Date(2017, 7, 11);

        Date today = start;

        System.out.println("start: " + start);
        System.out.println("end: " + end);
        System.out.println("today: " + today);

        System.out.println();

        today.year = 2016;
        today.day = 17;
        end = today;

        System.out.println("start: " + start);
        System.out.println("today: " + today);
        System.out.println("end: " + end);


    }
}
