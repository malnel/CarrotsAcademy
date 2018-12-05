package pl.akademia;
import static java.lang.Math.PI;
//jeśli zaimportuję bez słowa static, to będę musiała się odwoływać do PI jako Math.PI

import java.util.Date;

public class Test {

    public void print() {
        System.out.println("Blok niestatyczny");
    }

    public Test() {
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.print();

        Date jd = new Date();
        pl.akademia.Date d = new pl.akademia.Date();

        System.out.println(7*PI);
    }

    //blok static wykona się najpierw
    static {
        System.out.println("Blok statyczny");
    }

}
