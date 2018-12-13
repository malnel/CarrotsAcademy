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

    @RequestMapping("/book/{title}/{isbn}")
    public Book returnBookFromPathVariable(@PathVariable String title, @PathVariable String isbn) {
        return new Book("title","isbn");
    }

    @RequestMapping("/book/string-to-convert")
    public Book returnBookFromStringConverted(@RequestParam("book") Book book) {
        return book;
    }
}
