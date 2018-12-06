import java.util.StringTokenizer;

public class Date {

    String year = "";
    String month = "";
    String day = "";

    public Date saveDate (String s) {
        Date date = new Date();
        StringTokenizer st = new StringTokenizer(s, "/.-");
//        while (st.hasMoreElements())
//            System.out.println(st.nextToken());
        while (st.hasMoreElements()) {
            date.year += st.nextToken();
            date.month += st.nextToken();
            date.day += st.nextToken();
        }
        return date;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Date date = new Date();
        date = date.saveDate("1945-10-10");
        System.out.println(date);
    }
}
