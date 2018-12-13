package workshop.spring5.configuration;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

/*
	TODO 4 klasa konfiguracyjna Spring MVC
 */
public class MainConfiguration {

	/*
		TODO 5 klasa implementuje ApplicationContextAware

			utwó®z prywatne pole ApplicationContext z setterem
	 */

	/*
		TODO 6 prywatna metoda zwracająca typ ITemplateResolver
											tworzy SpringResourceTemplateResolver
											ustawia applicationContext
													prefix na katalog z widokami
													suffix na html
													templateMode na TemplateMode.HTML
	 */

	/*
		TODO 7 definicja bean'a  - ResourceBundleMessageSource
									metoda zwraca ResourceBundleMessageSource
									metoda tworzy obiekt typu ResourceBundleMessageSource
									ustawia baseName
	 */

	/*
		TODO 8 definicja bean'a - SpringTemplateEngine
								metoda zwraca SpringTemplateEngine
								na utworzonym SpringTemplateEngine
								ustawia templateResolver
										messageSource
	 */

	/*
		TODO 9 definicja bean'a - ThymeleafViewResolver
								metoda zwraca typ ViewResolver
								tworzy obiekt ThymeleafViewResolver
								ustawia na nim templateEngine
								characterEncoding na UTF-8
	 */

}
