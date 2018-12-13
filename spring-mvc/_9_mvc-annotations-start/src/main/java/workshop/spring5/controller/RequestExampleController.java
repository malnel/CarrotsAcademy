package workshop.spring5.controller;

import org.springframework.stereotype.Controller;

@Controller
public class RequestExampleController {
    private static String VIEW_NAME = "request_examples";


    /*
        TODO 2 Endpoint POST, "/request-body"

        Metoda zwraca ModelAndView, przyjmuje jako parametr Book z adnotacją @RequestBody
        Endpoint oczekuje reprezentacji Book w formacie JSON.

        W ModelAndView ustawia
                                nzawę widoku
                                atrybut 'title', wartość title z obiektu Book

     */

    /*
        TODO 3 Endpoint GET, mapowanie na "/path-variable" z opcjonalną wartością title w url
        Metoda zwraca String z nazwą widoku, jako parametr przyjmuje:
                                                                    Optional<String>  z adnotajcą @PathVariable
                                                                    Model
               ustawia w modelu 'title' - wartość domyślą (jeśli nie przekazano w url) lub przekazaną wartość.
     */

    /*
        TODO 4 Endpoint GET, "request-param"
        Metoda zwraca Metoda zwraca String z nazwą widoku, jako paramet przyjmuje:
                                                                                   String  z adnotacją @RequestParam i domyślną wartośćią
                                                                                   Model
               ustawia w modelu 'title'.
     */


}