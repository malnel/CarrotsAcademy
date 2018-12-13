package workshop.spring5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {

    @GetMapping("/hello/{isError}")
    public ModelAndView postResponseController(@PathVariable  boolean isError) {
        String viewName = isError ? "error" : "hello";
        ModelAndView moedlAndView = new ModelAndView(viewName);

        if (isError) {
            moedlAndView.addObject("errorMsg","An error has occurred");
        } {
            moedlAndView.addObject("msg","Hello, everything is fine!");
        }

        return moedlAndView;
    }
}
