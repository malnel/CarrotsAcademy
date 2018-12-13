package workshop.spring5.persistence.purejdbc.dao;

import workshop.spring5.persistence.purejdbc.model.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookRepositoryImpl implements BookRepository {

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

}
