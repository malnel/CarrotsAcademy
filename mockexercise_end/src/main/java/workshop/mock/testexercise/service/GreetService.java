package workshop.mock.testexercise.service;



public class GreetService {

    private String defaultGreeting = "Hello Mock!";

    public String hello(String name) {
        return name == null ? defaultGreeting : "Hello " + name;
    }
}
