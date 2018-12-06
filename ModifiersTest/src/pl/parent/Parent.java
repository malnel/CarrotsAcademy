package pl.parent;

public class Parent {
    private String privateField;
    String defaultField;
    public String publicField;
    protected String protectedField;

    {
        System.out.println("To jest blok kodu rodzica");
    }

    public String getPrivateField() {
        return privateField;
    }

    public void setPrivateField(String privateField) {
        this.privateField = privateField;
    }

    public String getDefaultField() {
        return defaultField;
    }

    public void setDefaultField(String defaultField) {
        this.defaultField = defaultField;
    }

    public String getPublicField() {
        return publicField;
    }

    public void setPublicField(String publicField) {
        this.publicField = publicField;
    }

    public String getProtectedField() {
        return protectedField;
    }

    public void setProtectedField(String protectedField) {
        this.protectedField = protectedField;
    }

    public Parent(String privateField, String defaultField, String publicField, String protectedField) {
        this.privateField = privateField;
        this.defaultField = defaultField;
        this.publicField = publicField;
        this.protectedField = protectedField;
        System.out.println("To jest konstruktor parametrowy rodzica");
    }

    public Parent() {
        System.out.println("To jest konstruktor bezparametrowy rodzica");
    }

    static {
        System.out.println("To jest statyczny blok kodu rodzica");
    }
}


