package workshop.sb.profiles.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import workshop.sb.profiles.db.FakeDataSource;

@Configuration
public class DataSourceConfiguration {

    @Bean(name="datasource")
    @Profile({"development","default"})
    public FakeDataSource devDataSource() {
        return new FakeDataSource("localhost-url", 8080);
    }

    @Bean(name="datasource")
    @Profile("production")
    public FakeDataSource prodDataSource() {
        return new FakeDataSource("production-url", 9999);
    }

}
