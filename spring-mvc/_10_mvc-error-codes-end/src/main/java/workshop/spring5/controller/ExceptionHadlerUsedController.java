package workshop.spring5.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ExceptionHadlerUsedController {

    @GetMapping("/exception/{shouldThrow}")
    public ResponseEntity<String> postResponseController(@PathVariable boolean shouldThrow) {
        if(shouldThrow) throw new MyCustomException();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason="Oh no, somebody has stolen the server")
class MyCustomException extends RuntimeException {}
