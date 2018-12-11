package workshop.sb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import workshop.sb.config.service.GreetService;
import workshop.sb.config.service.GreetServiceFirstImplementation;

@Configuration
// Wyszukanie komponentu (tylko kontroller, serwis jest
// tworzony w metodzie z adnotacją @Bean
@ComponentScan(basePackages = {"workshop.sb.config.controller"})
// Ładowanie propertisów z plików innych niż default
@PropertySource("classpath:service.properties")
public class JavaConfig {


    @Value("${service.first.implementation.msg}")
    public String firstImplMsg;

    @Bean
    @Profile("java")
    public GreetService greetService() {
        return new GreetServiceFirstImplementation(firstImplMsg);
    }
}


