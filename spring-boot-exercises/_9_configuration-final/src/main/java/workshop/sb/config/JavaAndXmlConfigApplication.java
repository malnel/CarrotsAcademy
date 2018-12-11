package workshop.sb.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// Potrzebne dla spring boot'a, dla profilu xml
@ImportResource("classpath:/spring.xml")
public class JavaAndXmlConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaAndXmlConfigApplication.class, args);
    }
}
