package workshop.sb.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String greetName(@RequestParam(value = "name", required = false) String name) {
        String greeting = "Hello, ";
        String defaultName = "World!";
        return name != null ? greeting + name : greeting + defaultName;
    }
}


