package workshop.spring5.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

/*
	TODO 2 Klasa konfiguracyjna aplikacji MVC, definicja ziarna tworzy ResourceBundleViewResolver
 */
public class MainConfiguration {


}

/*
	TODO 3 utwórz plik .properties, na który wskazuje ResourceBundleViewResolver
		W pliku dwa wpisy:
							<nazwa-widoku>.(class)=org.springframework.web.servlet.view.JstlView
							<nazwa-widoku>.url=WEB-INF/<sciezka-i-nazwa-widoku-z-rozszerzeniem>

		Plik musi być na classpath, np. w WEB-INF/classes

 */