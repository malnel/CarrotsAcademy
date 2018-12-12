package workshop.sb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // TODO 4 zdefiniuj pola hello, msg, foo, wstrzyknij do nich wartości używając @Value
    @Value("${hello.controller.hello}")
    private String hello;

    @Value("${hello.controller.msg}")
    private String msg;

    @Value("${hello.controller.foo}")
    private String foo;

    // TODO 5 utwórz metodę obsługującą GET, "/hello"
    @GetMapping("/hello")
    public String hello() {
        return hello;
    }

    // TODO 7 utwórz metodę obsługującą GET, "/msg"
    @GetMapping("/msg")
    public String msg() {
        return msg;
    }

    // TODO 9 utwórz metodę obsługującą GET, "/foo"
    @GetMapping("/foo")
    public String foo() {
        return foo;
    }
}


