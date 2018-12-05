package pl.akademia;

public class Date {

    int year;
    int month;
    int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getInfo() {
        return  "{year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
