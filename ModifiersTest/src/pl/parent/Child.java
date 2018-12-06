package pl.parent;

import pl.parent.Parent;

public class Child extends Parent {

    void go() {
        this.getPrivateField();
    }

    String s;

    {
        System.out.println("To jest zwykły blok kodu dziecka");
    }

    public Child(String privateField, String defaultField, String publicField, String protectedField) {
        super(privateField, defaultField, publicField, protectedField);
        System.out.println("To jest konstruktor parametrowy dziecka");
    }

    public Child() {
        System.out.println("To jest konstruktor bezparametrowy dziecka");
    }

    public Child(String s) {
        this(); //to mi wywoła konstruktor bezparametrowy dziecka
        this.s = s;
        System.out.println("To jest konstruktor parametrowy dziecka");
    }

    static {
        System.out.println("To jest statyczny kod dziecka");
    }
}
