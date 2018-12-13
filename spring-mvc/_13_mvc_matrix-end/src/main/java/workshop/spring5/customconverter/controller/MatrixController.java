package workshop.spring5.customconverter.controller;

import org.springframework.web.bind.annotation.*;
import workshop.spring5.customconverter.model.Book;

import java.util.Map;

@RestController
public class MatrixController {

    @RequestMapping("/")
    public String welcome() {
        return "Welcome to Matrix Variables Example.";
    }

    @RequestMapping("/book/{title}/{isbn}/{author}/{rating}")
    public Book returnBookFromPathVariable(@PathVariable String title,
                                           @PathVariable String isbn,
                                           @PathVariable String author,
                                           @PathVariable String rating) {
        return new Book(title, isbn, author, rating);
    }


    /*
        http://localhost:8080/matrix/matrixvars/book;title=aTitle;isbn=anIsbn;author=anAuthor;rating=someRating
     */
    @RequestMapping("/matrixvars/{book}")
    public Book returnBookFromMatrix(@MatrixVariable Map<String, String> matrixVars) {
        return new Book(matrixVars.get("title"),
                matrixVars.get("isbn"),
                matrixVars.get("author"),
                matrixVars.get("rating"));
    }
}
