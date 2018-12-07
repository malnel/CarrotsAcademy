public class Test {
    public static void main(String[] args) {
        Address address = new Address("Lol", "Hej");
        Person p = new Person(address);
        //p.address = new Address(""); nie mogę ustawić nowego adresu, bo jest to pole final
        p.address.street = "Ulica"; //wewnątrz obiektu adres mogę zmienić pole, bo ono nie jest finalne
        //p.address.city = "hej"; tego nie mogę zmienić, bo to pole finalne
    }
}

class Person {
    final Address address;

    public Person(Address address) {
        this.address = address;
    }
}

class Address {
    String street;
    final String city;
    Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
}
