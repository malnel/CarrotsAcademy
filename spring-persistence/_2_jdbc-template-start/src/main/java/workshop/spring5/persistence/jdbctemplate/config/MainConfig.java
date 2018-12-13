package workshop.spring5.persistence.jdbctemplate.config;

/*
    TODO 3 zmień poniższą klasę na klasę konfiguracyjną Spring'a
    skanowanie pakietów - workshop.spring5.persistence.jdbctemplate
 */
public class MainConfig {

    /* TODO 6 dataSource  - będzie wykorzystany dla wielu metod
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

    /*
        TODO 7 definicja jdbcTemplate
            Utwórz medotę zwracającą ziarno Spring'a  (@Bean)

            Zwracany typ: org.springframework.jdbc.core.JdbcTemplate
            W metodzie utwórz obiekt jdbcTemplate i ustaw w nim dataSource
            zwracany przez dataSource()
        */
    /*
        TODO 18 definicja namedParameterJdbcTemplate
            Utwórz medotę zwracającą ziarno Spring'a  (@Bean)

            Zwracany typ : org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
            W metodzie przekaż do konstruktora NamedParameterJdbcTemplate dataSource()
        */

}
