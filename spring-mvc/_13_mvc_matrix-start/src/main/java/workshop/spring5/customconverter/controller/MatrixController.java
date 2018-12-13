package workshop.spring5.customconverter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatrixController {

    @RequestMapping("/")
    public String welcome() {
        return "Welcome to Matrix Variables Example.";
    }

    /*
        TODO 1 endpoint GET, "/book/{title}/{isbn}/{author}/{rating}"
        Metoda zwraca Book, tworzy obiekt na podstawie parametrów mapowanych z url'a
     */

    /*
        TODO 2 endpoint GET, "/matrixvars/{book}"
        Metoda zwraca Book, tworzy obiekt na podstawie mapy Map<String, String> będącej parametrem metody.
        Potrzebna adnotacja dla parametru - jaka?
     */
}
