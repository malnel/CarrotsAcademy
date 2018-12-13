package workshop.spring5.persistence.purejdbc.dao;

import workshop.spring5.persistence.purejdbc.model.Book;

public interface BookRepository {
    Book getBook(long id);
}
