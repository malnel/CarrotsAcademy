package workshop.spring5.customconverter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import workshop.spring5.customconverter.converter.StringToBookConverter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "workshop.spring5.customconverter")
/*
    TODO 5 zaimplementuj WebMvcConfigurer
    Naspisz metodę void addFormatters(FormatterRegistry registry)
    W metodzie dodaj do registry zaimpementowany wcześniej konwerter.
 */
public class MainConfig {

}

/*
    TODO 6 po przetestowaniu w przeglądarce wykomentuj zależność jackson-dataformat-xml,
    przedbuduj i zrestartuj aplikację - sprawdź, czy coś się zmieniło.
 */