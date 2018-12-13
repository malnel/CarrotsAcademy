package workshop.spring5.customconverter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "workshop.spring5.customconverter")
/*
    TODO 3 Implementor WebMvcConfigurer
    Nadpisz void configurePathMatch(PathMatchConfigurer configurer)
    do configurer dodaj UrlPathHelper z ustawioną flagą false na setRemoveSemicolonContent

 */
public class MainConfig {

}
