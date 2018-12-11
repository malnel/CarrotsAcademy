package workshop.sb.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {


    // Pobranie parametrów przy użyciu @PathVariable, przykładowe wywołanie: localhost:8080/add/1/2

    @GetMapping("/add/{n1}/{n2}")
    public double add(@PathVariable double n1, @PathVariable double n2) {
        return n1 + n2;
    }

    @GetMapping("/sub/{n1}/{n2}")
    public String sub(@PathVariable double n1, @PathVariable double n2) {
        return String.valueOf(n1 - n2);
    }


    // Pobranie parametrów przy użyciu @RequestParam, przykładowe wywołanie: localhost:8080/mul/?n1=1&n2=2

    @GetMapping("/mul")
    public String mul(@RequestParam double n1, @RequestParam double n2) {
        return String.valueOf(n1 * n2);
    }

    @GetMapping("/div")
    public String div(@RequestParam double n1, @RequestParam double n2) {
        return String.valueOf(n1 / n2);
    }

}
