package pl.akademia;

import java.util.StringTokenizer;

public class Date {

    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("%4d/%02d/%02d", year, month, day);
    }

    public Date saveDate (String s) {
        Date date = new Date();
        StringTokenizer st = new StringTokenizer(s, "/.-");
        while (st.hasMoreElements()) {
            date.setYear(Integer.parseInt(st.nextToken()));
            date.setMonth(Integer.parseInt(st.nextToken()));
            date.setDay(Integer.parseInt(st.nextToken()));
        }
        return date;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Date() {
    }
}
