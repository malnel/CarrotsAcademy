package workshop.spring5.persistence.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import workshop.spring5.persistence.hibernate.model.Book;

import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Long save(Book book) {
        return (Long)sessionFactory.getCurrentSession().save(book);
    }

    @Override
    public Book get(Long id) {
        return sessionFactory.getCurrentSession().get(Book.class, id);
    }

    @Override
    public List<Book> list() {
        return sessionFactory.getCurrentSession().createQuery("from Book").list();
    }

    @Override
    public void update(Book book) {
        sessionFactory.getCurrentSession().update(book);
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Book book = session.byId(Book.class).load(id);
        session.delete(book);
    }
}
