public class Person {

    String name;
    String lastName;
    Integer pesel;
    final Address address;


    public Person(Address address) {
    }

    public Person(Address address) {
        this.address = address;
    }

    public Person(String name, String lastName, Integer pesel, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
    }
}
