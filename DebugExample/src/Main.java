public class Main {

    static final String POLE_KLASY_MAIN = "Some static value";
    String poleObiektuWKlasieField = "pole obiektu";

    static String returnFirstElementFromTable(String [] table) {
        return table[0];
    }

    public static void main(String[] args) {
        String [] s = {"A", "B", "C"};
        args = s;
        Person[] people = {new Person("Ala", "Kowalska", 1234567894),
                           new Person("", "Nowak", 234656433),
                           //null,
                           new Person("Piotr", "", null)};

        for(Person person : people) {
            System.out.println(person.pesel);
        }
    }
}
