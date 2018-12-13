package workshop.spring5.persistence.hibernate.service;

import workshop.spring5.persistence.hibernate.model.Author;

import java.util.List;

public interface AuthorService {
    long save(Author Author);

    Author findById(long id);

    List<Author> list();

    void update(Author Author);

    void deleteById(long id);
}
