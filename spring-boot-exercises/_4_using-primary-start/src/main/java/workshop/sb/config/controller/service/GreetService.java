package workshop.sb.config.controller.service;

import org.springframework.stereotype.Service;

@Service
public class GreetService {

    public static String MSG = "Hello World";

    public String getMsg() {
        return MSG;
    }
}


/*
 TODO 2 refaktor klasy GreetService na interfejs
 interfejs GreetService
                         ze zdefinowanym polem polem MSG i
                         deklaracją metody String getMsg()


 2 implementory
                         GreetServiceFirstImplementation
                         GreetServiceSecondImplementation

                        implementacje getMsg() będą zwracały MSG + jakiś string, charakterystyczny dla implementora

  */

// TODO 3 uruchom aplikację (nie test) - co pojawiło się w logu?

// TODO 4 dodaj adnotację @Primary na jednym (tylko jednym) z serwisów

// TODO 5 - uruchom ponownaie aplikację i przetestuj w przeglądarce
