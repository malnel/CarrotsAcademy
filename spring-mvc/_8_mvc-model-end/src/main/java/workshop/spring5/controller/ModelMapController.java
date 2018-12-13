package workshop.spring5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModelMapController {

    @GetMapping("/model-map")
    public String useModelMap(ModelMap map) {
        map.addAttribute("first", "the first from ModelAndMap");
        map.addAttribute("second", "the second from ModelAndMap");
        return "model_map";
    }
}
