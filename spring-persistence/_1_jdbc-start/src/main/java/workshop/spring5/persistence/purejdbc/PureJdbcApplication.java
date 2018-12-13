package workshop.spring5.persistence.purejdbc;

public class PureJdbcApplication {
    public static void main(String[] args) {

    }
}


/* Szkielet projektu

    zależnośc w maven
	pakiety
	interfejs i klasy
	deklaracja metody w interfejsie
	pusta implementacja w implementorze

*/

/* 	TODO 0 dodaj zależnośc w maven dla postgresql
         9.4-1200-jdbc41

 */

/* 	TODO 1 utwórz pakiety

						workshop.spring5.persistence.purejdbc.dao
						workshop.spring5.persistence.purejdbc.model
 */


/*
	TODO 2 utwórz klasę modelu
						workshop.spring5.persistence.purejdbc.dao.model.Book

						Pola klasy:

						private long id;
    					private String title;
    					private String isbn;
    					private String Author;

						Wygeneruj przy pomocy IDE:

    					get /set
    					toString
 */

//TODO 3 interfejs workshop.spring5.persistence.purejdbc.dao.BookRepository


//TODO 4 implementor - workshop.spring5.persistence.purejdbc.dao.BookRepositoryImpl implements BookRepository


// DAO

// TODO 5 - w interfejsie zadeklaruj metodę Book getBook(long id);


/*
	TODO 6 - w BookRepositoryImpl wygeneruj pustą implementację metody

	public Book getBook (long id) {
		// Zadeklarowanie i utworzenie  url (String)
		// Zadeklarowanie connection

		try {
            Book book = null;
			// Utworzenie connection z DriverManagera

			// preparedStatement

			// resultSet

			// Utworzenie book na podstawie pobranych danych

			// zamknięcie resultSert
			// zamknięcie connection

            return book;

		}
		// catch / finally

	}

 */


//TODO 7 Zadeklarowanie i utworzenie  url, zadeklarowanie connection:


//TODO 8 utworzenie connection z DriverManager'a



//TODO 9 preparedStatement - pobranie z bazy book, na podstawie id

//TODO 10 resultSet


//TODO 11 Utworzenie book na podstawie pobranych danych

//TODO 12 zamknięcie resultSet i preparedStatement, zwrócenie book z metody

/* TODO 13 w PureJdbcApplication skorzystaj z metody getBook do wyświetlenia danych książki w konsoli
    W pliku init_postgres_db_and_user.sql utworzono jeden rekord o id 1
*/































/* 	0 dodaj zależnośc w maven
        	<dependency>
                <groupId>org.postgresql</groupId>
                <artifactId>postgresql</artifactId>
                <version>9.4-1200-jdbc41</version>
		    </dependency>

 */

/* 	1 utwórz pakiety

						workshop.spring5.persistence.purejdbc.dao
						workshop.spring5.persistence.purejdbc.model
 */


/*
	2 utwórz klasę modelu
						workshop.spring5.persistence.purejdbc.dao.model.Book

						Pola klasy:

						private long id;
    					private String title;
    					private String isbn;
    					private String Author;

						Wygeneruj przy pomocy IDE:

    					get /set
    					toString
 */

/*
	3 interfejs workshop.spring5.persistence.purejdbc.dao.BookRepository
 */

/*
	4 implementor - workshop.spring5.persistence.purejdbc.dao.BookRepositoryImpl implements BookRepository
 */

// DAO

/*
	5 - w interfejsie zadeklaruj metodę Book getBook(long id);
 */

/*
	6 - w BookRepositoryImpl wygeneruj pustą implementację metody

 */

/* Implementacja public Book getBook(long id)

	public Book getBook (long id) {
		// Zadeklarowanie i utworzenie  url (String)
		// Zadeklarowanie connection

		try {
            Book book = null;
			// Utworzenie connection z DriverManagera

			// preparedStatement

			// resultSet

			// Utworzenie book na podstawie pobranych danych

			// zamknięcie resultSert
			// zamknięcie connection

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

 */


/*  7 Zadeklarowanie i utworzenie  url, zadeklarowanie connection:

	String url = "jdbc:postgresql://<host>:<port>/<baza>?user=<uzytkownik>&password=<haslo>";
	Connection conn = null;
 */

/*  8 utworzenie connection z DriverManager'a

	conn = DriverManager.getConnection(url);
 */


/*  9 preparedStatement - pobranie z bazy book, na podstawie id

	PreparedStatement ps = conn.prepareStatement("SELECT * FROM book WHERE book_id = ?");
    ps.setLong(1, id);
 */

/*  10 resultSet

    ResultSet rs = ps.executeQuery();
 */

/*  11 Utworzenie book na podstawie pobranych danych

            Book book = null;
            if (rs.next()) {
                book = new Book();
                book.setId(id);
                book.setTitle(rs.getString("title"));
                book.setIsbn(rs.getString("isbn"));
                book.setAuthor(rs.getString("title"));
            }
 */

/*  12 zamknięcie resultSet i preparedStatement, zwrócenie book z metody

            rs.close();
            ps.close();

            return book;
 */

/*
    13 w PureJdbcApplication skorzystaj z metody getBook do wyświetlenia danych książki w konsoli


      public static void main(String[] args) {
        System.out.println(new BookRepositoryImpl().getBook(1));
      }
*/