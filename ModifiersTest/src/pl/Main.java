package pl;

import pl.parent.Child;
import pl.parent.Parent;

public class Main {

    public static void main(String[] args) {
        String s = "lol";
        Child child = new Child(s);

        Parent parent = new Parent("lol", "hej", "a", "g");
        System.out.println(parent.toString());
    }
}
