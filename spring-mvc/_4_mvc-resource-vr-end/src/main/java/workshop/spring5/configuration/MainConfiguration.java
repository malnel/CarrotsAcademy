package workshop.spring5.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "workshop.spring5")
public class MainConfiguration {

	@Bean
	public ViewResolver resourceBundleViewResolver() {
		ResourceBundleViewResolver bean = new ResourceBundleViewResolver();
		bean.setBasename("views");
		return bean;
	}

}