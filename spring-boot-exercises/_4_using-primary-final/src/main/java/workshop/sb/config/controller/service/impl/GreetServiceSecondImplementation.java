package workshop.sb.config.controller.service.impl;

import org.springframework.stereotype.Service;
import workshop.sb.config.controller.service.GreetService;

@Service
public class GreetServiceSecondImplementation implements GreetService {

    public static String SECOND_IMPL = " from the second implementation.";

    @Override
    public String getMsg() {
        return MSG + SECOND_IMPL;
    }
}
