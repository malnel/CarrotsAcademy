package workshop.sb.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

// TODO 1 - zapoznaj się z kodem, uruchom aplikację

/* TODO 6 testy w przeglądarce


    localhost:8080/scope-default - każdy request inkrementuje (ten sam, nowy tab)
    localhost:8080/scope-request - każdy request zwarca 0
    localhost:8080/scope-session - otworzyć dodatkowo przeglądarkę w trybie 'incognito'
                                   requesty inkrementują w osobnych sesjach
 */
