package workshop.sb.config.service;

public class GreetServiceSecondImplementation implements GreetService {

    private String secondImpl;

    @Override
    public String getMsg() {
        return MSG + " " + secondImpl;
    }

    public GreetServiceSecondImplementation(String msg) {
        secondImpl = msg;
    }
}
