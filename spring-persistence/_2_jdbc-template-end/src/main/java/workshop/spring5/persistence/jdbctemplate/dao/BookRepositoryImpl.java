package workshop.spring5.persistence.jdbctemplate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;
import workshop.spring5.persistence.jdbctemplate.model.Book;

import java.sql.*;

// TODO 2 - zamień klasę w springowy komponent - nazwij go bookRepository

@Component("bookRepository")
public class BookRepositoryImpl implements BookRepository {

    // TODO 8  wstrzyknij jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;


    // TODO 19 wstrzyknij namedParameterJdbcTemplate
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    /*
            TODO 5 dzięki Spring JdbcTemplate znacznie uprościmy kod w metodach dao
                W tym punkcie nie ma żandego zadania do zrobiebia.
                To informacja o tym, co się będzie za chwilę działo : )
      */
    public Book getBook(long id) {
        String url = "jdbc:postgresql://localhost:5432/bookee?user=my_user&password=my_password";
        Connection conn = null;
        try {
            Book book = null;
            conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM book WHERE book_id = ?");
            ps.setLong(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                book = new Book();
                book.setId(id);
                book.setTitle(rs.getString("title"));
                book.setIsbn(rs.getString("isbn"));
                book.setAuthor(rs.getString("title"));
            }

            rs.close();
            ps.close();

            return book;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /*
        TODO 9 użycie jdbcTemplate
            Utwórz metodę:  String getBookNameById(long id)
            Metoda zwraca tytuł ksiażki na podstawie przekazanego id.
            Użyj metody jdbcTemplate#queryForObject
        */

    public String getBookNameById(long id) {

        String sql = "SELECT title FROM book WHERE book_id = ?";

        return jdbcTemplate.queryForObject(sql, new Object[]{id}, String.class);

    }

    /*
        TODO 12 użycie jdbcTemplate z row mapperem
            Utwórz metodę getBookById zwracającą Book na podstawie przekazanego id

      */
    public Book getBookById(long id) {

        String sql = "SELECT * FROM book WHERE book_id = ?";

        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BookMapper());

    }


    /*
        TODO 14 - metoda dla COUNT
            utwórz metodę int getSize() zwracającą ilość rekordów w tabeli
      */
    public int getSize() {
        String sql = "SELECT COUNT(*) FROM book";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    /*
        TODO 16 - metoda dla INSERT
            użyj metody jdbcTemplate#update
     */
    public void insertBook(Book book) {
        String sql = "INSERT INTO book (book_id, title, isbn, author) VALUES (?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{book.getId(), book.getTitle(), book.getIsbn(), book.getAuthor()});

    }

    /*
        TODO 20 - użycie namedParameterJdbcTemplate

        Utwórz metodę Book getByTitleAndAuthor(String title, String author);
        Utwórz sql (... WHERE title = :title ... )
        Utwórz MapSqlParameterSource i użyj metody addValue do przekazania title i author
        Wywołaj na namedParameterJdbcTemplate metodę queryForObject - przekaż sql, param source i mappera.
     */

    public Book getByTitleAndAuthor(String title, String author) {
        String sql = "SELECT * FROM book WHERE title = :title AND author = :author";
        SqlParameterSource namedParams = new MapSqlParameterSource()
                .addValue("title", title)
                .addValue("author", author);
        return namedParameterJdbcTemplate.queryForObject(sql, namedParams, new BookMapper());
    }

    /*
         TODO 11 implementacja RowMapper'a
             Statyczna klasa implementująca RowMapper, mapująca ResultSet na Book

      */
    private static final class BookMapper implements RowMapper<Book> {
        public Book mapRow(ResultSet resultSet, int i) throws SQLException {
            Book book = new Book();
            book.setId(resultSet.getInt("book_id"));
            book.setTitle(resultSet.getString("title"));
            book.setIsbn(resultSet.getString("isbn"));
            book.setAuthor(resultSet.getString("title"));
            return book;
        }
    }
}
