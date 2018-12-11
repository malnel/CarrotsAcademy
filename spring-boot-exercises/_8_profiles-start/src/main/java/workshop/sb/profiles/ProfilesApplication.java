package workshop.sb.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfilesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProfilesApplication.class, args);
    }
}

/* TODO 1 utwórz pakiety:
                            workshop.sb.profiles.configuratiom
                            workshop.sb.profiles.db

*/

/*
    TODO 2 w workshop.sb.profiles.db utwórz klasę FakeDataSource, z polami:
                            String url
                            int port
 */

/*  TODO 3 w workshop.sb.profiles.configuratiom utwórz konfigurację DataSourceConfiguration z 2 definicjami beanów FakeDataSource:
                            obie definicje będą zwracały bean'y o nazwie 'datasource'
                            pierwsza, profil 'development'
                            druga, profil 'production'

                            utwórz obiekty FakeDataSource o różnych wartościach pól url i port


                            Przykład definicji bean'a

                            @Bean(name="nazwa_ziarna")
                            @Profile("nazwa_profilu")
                            public Object beanDefaultName() {
                                return new Object();
                            }
*/

// TODO 4 zmień domyślne skanowanie komponentów dla SpringBoot - dla pakietów 'wychodzących' poza workshop.sb.profiles

// TODO 5 dodaj wpis w application.properties: spring.profiles.active=development

/* TODO 5 w metodzie Application#main
                            pobierz z kontekstu bean'a datasource i
                            wylistuj url i port
*/

// TODO 6 zmień aktywny profil na production i uruchom aplikację  - czy coś się zmieniło?
