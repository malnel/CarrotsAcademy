package workshop.spring5.persistence.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import workshop.spring5.persistence.hibernate.model.Author;

import java.util.List;

@Repository
public class AuthorRepositoryImpl implements AuthorRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public long save(Author author) {
        Session session = sessionFactory.getCurrentSession();
        Long bookId = (Long)session.save(author);
        return bookId;
    }

    @Override
    public Author findById(long id) {
        return sessionFactory.getCurrentSession().get(Author.class, id);
    }

    @Override
    public List<Author> list() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Author").list();
    }

    @Override
    public void update(Author author) {
        Session session = sessionFactory.getCurrentSession();
        session.update(author);
    }

    @Override
    public void deleteById(long id) {
        Session session = sessionFactory.getCurrentSession();
        Author book = session.byId(Author.class).load(id);
        session.delete(book);
    }
}
