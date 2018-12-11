package workshop.sb.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import workshop.sb.config.service.GreetService;

@RestController
public class GreetController {

//                                      Wersja 1
    @Autowired
    private GreetService greetService;

//                                      Wersja 2
//    private GreetService greetService;
//    @Autowired
//    public void setGreetService(GreetService greetService) {
//        this.greetService = greetService;
//    }

//                                      Wersja 3
//    @Autowired
//    public GreetController(GreetService greetService) {
//        this.greetService = greetService;
//    }

    @GetMapping("/greet")
    public String greet() {
        return greetService.getMsg();
    }
}
