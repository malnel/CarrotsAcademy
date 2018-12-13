package workshop.spring5.persistence.jdbctemplate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/*
    TODO 3 zmień poniższą klasę na klasę konfiguracyjną Spring'a
    skanowanie pakietów - workshop.spring5.persistence.jdbctemplate
 */
@Configuration
@ComponentScan(basePackages = "workshop.spring5.persistence.jdbctemplate")
public class MainConfig {
    /* TODO 6 dataSource  - wykorzystany dla wielu metod
            można użyć innej implementacji np dbcp dla puli połączeń

            Utwórz medotę zwracającą ziarno Spring'a  (@Bean)

            Zwracany typ: javax.sql.DataSource;
            W metodzie utwórz org.springframework.jdbc.datasource.DriverManagerDataSource
            Ustaw w utworzonym obiekcie pola:
                                            driverClassName (dla postgresa)
                                            url             (wskazuje na bazę bookee)
                                            username        (dane jak przy tworzeniu
                                            password         użytkownika w postgres )

            (można użyć innej implementacji np. dbcp dla optymalizacji puli połączeń)
     */

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/bookee");
        dataSource.setUsername("my_user");
        dataSource.setPassword("my_password");
        return dataSource;
    }

    /*
        TODO 7 definicja jdbcTemplate
            Utwórz medotę zwracającą ziarno Spring'a  (@Bean)

            Zwracany typ: org.springframework.jdbc.core.JdbcTemplate
            W metodzie utwórz obiekt jdbcTemplate i ustaw w nim dataSource
            zwracany przez dataSource()
     */

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    /*
        TODO 18 definicja namedParameterJdbcTemplate
        Utwórz metodę zwracającą ziarno Spring'a  (@Bean)
        Zwracany typ : org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
        W metodzie przekaż do konstruktora NamedParameterJdbcTemplate dataSource()
     */
    @Bean
    public NamedParameterJdbcTemplate namedJdbcTemplate() {
        NamedParameterJdbcTemplate namedJdbcTemplate = new NamedParameterJdbcTemplate(dataSource());
        return namedJdbcTemplate;
    }
}