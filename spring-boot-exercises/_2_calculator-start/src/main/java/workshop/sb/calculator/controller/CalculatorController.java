package workshop.sb.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add/{n1}/{n2}")
    public String add(@PathVariable double n1, @PathVariable double n2) {
        return String.valueOf(n1 + n2);
    }

    @GetMapping("/sub/{n1}/{n2}")
    public String sub(@PathVariable double n1, @PathVariable double n2) {
        return String.valueOf(n1 - n2);
    }

    @GetMapping("/mul")
    public String mul(@RequestParam double n1, @RequestParam double n2) {
        return String.valueOf(n1 * n2);
    }

    @GetMapping("/div")
    public String div(@RequestParam double n1, @RequestParam double n2) {
        return String.valueOf(n1/n2);
    }


}
