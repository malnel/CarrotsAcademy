package workshop.spring5.controller;

import org.springframework.stereotype.Controller;

@Controller
public class ExceptionHadlerUsedController {

    /*
        TODO 2 endpoint GET, "/exception/{shouldThrow}"
        Metoda zwraca ResponseEntity<String>, przyjmuje @PathVariable boolean.
        Jeśli true - rzuca MyCustomException,
        Rw przeciwnym wypadku zwraca w ResponseEntity (dowolnie wybrany) HttpStatus
     */
}

/*
    TODO 1 utwórz klasę MyCustomException rozszerzającą RuntimeException
    Użyj na klasie @ResponseStatus
                                    value : ustaw HttpStatus - np. INTERNAL_SERVER_ERROR
                                    reason: jakiś tekst
 */