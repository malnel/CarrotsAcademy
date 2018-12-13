package workshop.spring5.persistence.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import workshop.spring5.persistence.hibernate.dao.BookRepository;
import workshop.spring5.persistence.hibernate.model.Book;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    @Transactional
    public long save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book findById(long id) {
        return bookRepository.get(id);
    }

    @Override
    public List<Book> list() {
        return bookRepository.list();
    }

    @Override
    @Transactional
    public void update(Book book) {
        bookRepository.update(book);
    }

    @Override
    @Transactional
    public void deleteById(long id) {
        bookRepository.delete(id);
    }
}
