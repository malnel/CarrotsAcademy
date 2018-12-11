package workshop.sb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import workshop.sb.config.service.GreetService;
import workshop.sb.config.service.GreetServiceFirstImplementation;

@Configuration
@ComponentScan(basePackages = {"workshop.sb.config.controller"})
@PropertySource("classpath:service.properties")
public class JavaConfig {

    @Value("${service.first.implementation.msg}")
    public String firstImplMsg;

    @Bean
    @Profile("java")
    public GreetService firstImpl() {
        return new GreetServiceFirstImplementation(firstImplMsg);
    }
}


