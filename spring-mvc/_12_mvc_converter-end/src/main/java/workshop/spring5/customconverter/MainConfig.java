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
public class MainConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToBookConverter());
    }
}
