package workshop.spring5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import workshop.spring5.model.Book;



@Controller
@RequestMapping("/books")
/*
    TODO 4 Zmień klasę na kontroller, mapowanie (dodawane do wszystkich metod z kontrolera) "/books"
 */
public class BookController {

    /*
        TODO 5 endpoint GET, "/add"
        Metoda zwraca obiekt ModelAndView
                                        viewName: add-book,
                                        modelName: book
                                        obiekt: new Book()

     */


    /*
        TODO 6 endpoint POST, "/process-form"
        Metoda zwraca String, parametry metody:
                                                @ModelAttribute(<nazwa-taka-jak-w-add-book>) Book book
                                                BindingResult result
                                                ModelMap model

        Metoda zwraca nazwę widoku, wyświetlającą obiekt book (trzeba ustawić dane do wyświetlenia)
        lub nazwę widoku w przypadku wystąpienia błędów walidacyjnych (trzeba sprawdzić, czy wystąpiły błędy).

     */

}
