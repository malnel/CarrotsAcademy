package workshop.sb.config.controller.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetServiceFirstImplementation implements GreetService {

    public static String FIRST_IMPL = " from the first implementation.";

    @Override
    public String getMsg() {
        return MSG + FIRST_IMPL;
    }
}
