package workshop.sb.config.controller.service;

import org.springframework.stereotype.Service;

@Service
public class GreetServiceSecondImplementation implements GreetService {

    public static String SECOND_IMPL = " from the second implementation";

    @Override
    public String getMsg() {
        return MSG + SECOND_IMPL;
    }
}
