package workshop.spring5.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import workshop.spring5.model.Book;


@Controller
public class ResponseEntityUsedController {

    @GetMapping("/entity/{hasCredentials}")
    public ResponseEntity<String> postResponseController(@PathVariable  boolean hasCredentials) {
        HttpStatus responseStatus = hasCredentials == true ? HttpStatus.FOUND : HttpStatus.FORBIDDEN;
        String responseMessage = hasCredentials == true ? "Welcome!" :"Emmm something is wrong";
        return new ResponseEntity<>(responseMessage, responseStatus);
    }
}
