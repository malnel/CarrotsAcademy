package workshop.spring5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import workshop.spring5.model.Book;

import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/*
    Testing in browser / POSTMAN

    Use %20 instead of a whitespace in url param

    Book in JSON format:
    {"title":"a title","author":"an author"}

    Mapowanie jackson databind
             Nagłówek  w requeście powinien być ustawiony na
             Content-Type application/json

             Potrzebna zależność:
                                    <dependency>
                                        <groupId>com.fasterxml.jackson.core</groupId>
                                        <artifactId>jackson-databind</artifactId>
                                        <version>2.9.7</version>
                                    </dependency>
 */
@Controller
public class RequestExampleController {
    private static String VIEW_NAME = "request_examples";

    @PostMapping("/request-body")
    ModelAndView useReuestBody(@RequestBody Book book) {
        ModelAndView modelAndView = new ModelAndView(VIEW_NAME);
        modelAndView.addObject("title", book.getTitle());
        return modelAndView;
    }

    @RequestMapping(method=GET, value={"/path-variable/{title}", "/path-variable"})
    String usePathVariable(@PathVariable(value = "title") Optional<String> optional, Model model) {
        if(optional.isPresent()) {
            model.addAttribute("title", optional.get());
        } else {
            model.addAttribute("title", "default value");
        }
        return VIEW_NAME;
    }

    @RequestMapping("/request-param")
    String useRequestParam(@RequestParam(value = "title", defaultValue = "default title")
                                   String title,
                                   Model model) {
        model.addAttribute("title", title);
        return VIEW_NAME;
    }

}