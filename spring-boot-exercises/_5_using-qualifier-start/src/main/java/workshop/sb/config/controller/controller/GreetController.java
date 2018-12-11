package workshop.sb.config.controller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import workshop.sb.config.controller.service.GreetService;

@RestController
public class GreetController {

    @Autowired
    // TODO 3 dodaj adnotację @Qualifier z nazwą implementacji
    private GreetService greetService;

    @GetMapping("/greet")
    public String greet() {
        return greetService.getMsg();
    }
}
