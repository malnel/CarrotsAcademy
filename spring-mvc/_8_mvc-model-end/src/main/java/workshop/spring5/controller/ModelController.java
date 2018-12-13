package workshop.spring5.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;

        import java.util.HashMap;
        import java.util.Map;

@Controller
public class ModelController {

    @GetMapping("/model")
    public String useModel(Model model) {
        Map<String, String> map = new HashMap<>();
        map.put("first", "the first from Model ( a map - mergeAttributes)");
        map.put("second", "the second from Model ( a map - mergeAttributes)");
        model.addAttribute("third", "the third from Model (addAtrribute)");
        model.mergeAttributes(map);
        return "model";
    }
}
