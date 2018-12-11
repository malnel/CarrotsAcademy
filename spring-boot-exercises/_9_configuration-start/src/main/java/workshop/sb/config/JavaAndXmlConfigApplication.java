package workshop.sb.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// TODO 8 dodaj @ImportResource (dla ładowania konfiguracji XML przy starcie aplikacji)
public class JavaAndXmlConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaAndXmlConfigApplication.class, args);
    }
}


// TODO 2 w pakiecie workshop.sb.config.service dodaj GreetServiceSecondImplementation zwracający inny msg
// TODO 3 przejdź do spring.xml - skonfiguruj aplikację