package workshop.sb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${hello.controller.hello}")
    private String hello;

    @Value("${hello.controller.bar}")
    private String bar;

    @Value("${hello.controller.foo}")
    private String foo;

    @GetMapping("/hello")
    public String hello() {
        return hello;
    }

    @GetMapping("/bar")
    public String bar() {
        return bar;
    }

    @GetMapping("/foo")
    public String foo() {
        return foo;
    }
}


