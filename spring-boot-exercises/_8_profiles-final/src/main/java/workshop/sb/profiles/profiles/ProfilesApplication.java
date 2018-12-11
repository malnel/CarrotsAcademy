package workshop.sb.profiles.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import workshop.sb.profiles.db.FakeDataSource;

@SpringBootApplication
@ComponentScan(basePackages = {"workshop.sb.profiles.configuration", "workshop.sb.profiles.db"})
public class ProfilesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ProfilesApplication.class, args);

        String url = ctx.getBean("datasource", FakeDataSource.class).getUrl();
        int port = ctx.getBean("datasource", FakeDataSource.class).getPort();
        System.out.println(String.format("#############  Datasource url: %s; port %d ##############", url, port));
    }
}