package workshop.spring5.customconverter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import workshop.spring5.customconverter.model.Book;

import javax.xml.ws.Response;

@RestController
public class BookController {

    @RequestMapping("/")
    public String welcome() {
        return "Welcome to Custom Converter Example.";
    }

    /*
        TODO 3 endpoint GET, "/book/{title}/{isbn}"
        Metoda zwraca Book, przyjmuje dwa stringi - mapuje do nich wartości ze ścieżki endpoint'a.
        Tworzy obiekt Book na podstawie swoich parametrów
     */


    /*
        TODO 4 endpoint GET, "/book/string-to-convert"
        Metoda zwraca Book, przyjmuje @RequestParam("book") Book book.
        Zwraca obiekt book ze swojego parametru.
    */
}
