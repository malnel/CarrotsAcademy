public class Address {

    private final String STREET;
    private int number;

    public String getStreet() {
        return STREET;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Address(String street, int number) {
        this.STREET = street;
        this.number = number;
    }
}
