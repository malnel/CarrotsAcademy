package workshop.spring5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
	TODO 1 kontroler
					GET, "/hello"
					metoda przyjmuje jako paramter org.springframework.ui.Model
					w ciele metody dodaj do modelu atrybut, do którego odwołasz się w widoku (para nazwa-wartość)
					zwróc nazwę widoku
 */
public class HelloController {

}

/*
	TODO 2 widok z rozszerzeniem .html (nazwa widoku taka, jaką zwraca metoda kontrolera)

	<html xmlns:th="http://www.thymeleaf.org">

	Użyj tagów span z th:text="..." dla wyświetlenia wartości z kontrolera i z pliku .properties

	Do atrybutu z przekazanego modelu 'dobieramy się' ${<nazwa-atrybutu>}
	Do atrybutu z .properties 'dobieramy się' #{jakas.nazwa}
 */

/*
	TODO 3 utwórz plik z roszerzeniem .properties

			w pliku zdefiniuj parę jakas.nazwa=jakas wartosc
 */
