package workshop.sb.config.service;

import org.springframework.stereotype.Service;

@Service
public class GreetService {

    public String getMsg() {
        return "Hello World!";
    }
}
