package workshop.spring5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelAndViewController {

    @GetMapping("/model-and-view")
    public ModelAndView useModelAndView() {
        ModelAndView modelAndView = new ModelAndView("model_and_view");
        modelAndView.addObject("first", "the first from ModelAndView");
        modelAndView.addObject("second", "the second from ModelAndView");
        return modelAndView;
    }
}
