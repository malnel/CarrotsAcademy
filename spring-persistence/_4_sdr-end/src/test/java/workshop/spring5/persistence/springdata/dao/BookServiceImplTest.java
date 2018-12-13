package workshop.spring5.persistence.springdata.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import workshop.spring5.persistence.springdata.config.MainConfig;
import workshop.spring5.persistence.springdata.model.Author;
import workshop.spring5.persistence.springdata.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/*
    TODO 8 dodaj do klasy adnotacje @RunWith i @ContextConfiguration
    Dodaj do metod testowych (metod z adnotacją @Test) adnotację @DirtiesContext
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MainConfig.class)
public class BookServiceImplTest {
    /*
        TODO 9 Wstrzyknij repozytorium
     */
    @Autowired
    private BookRepository bookRepository;

    /*
        TODO 10 zaimplementuj test
     */
    @Test
    @DirtiesContext
    public void shouldSaveAbook() {
        // Given
        int bookNo = 1;
        // When
        bookRepository.save(createBookWithAuthor(bookNo));
        // Then
        Book book = bookRepository.findById(1L).get();
        assertNotNull(book);
        assertEquals(book.getIsbn(), "ISBN_"+bookNo);
    }

    /*
        TODO 11 zaimplementuj test
    */
    @Test
    @DirtiesContext
    public void shouldNotFindAbook() {
        // Given
        long nonExistingId = 12345L;
        // When
        Optional<Book> bookOptional = bookRepository.findById(1L);
        // Then
        assertFalse(bookOptional.isPresent());

    }

    /*
        TODO 12 zaimplementuj test
    */
    @Test
    @DirtiesContext
    public void deleteById() {
        // Given
        List<Book> booksToBeSaved = createBooksWithAuthor(2);
        booksToBeSaved.stream().forEach(bookRepository::save);
        assertEquals(2,convertIterableToList(bookRepository.findAll()).size());

        // When
        bookRepository.deleteById(1L);

        // Then
        assertFalse(bookRepository.findById(1L).isPresent());
    }

    /*
        TODO 16 zaimplementuj test
     */
    @Test
    @DirtiesContext
    public void shouldFindAllUsingQueryFromRepository() {
        // Given
        List<Book> booksToBeSaved = createBooksWithAuthor(10);
        booksToBeSaved.stream().forEach(bookRepository::save);
        List<Book> listFromCRUDmethod = convertIterableToList(bookRepository.findAll());

        // When
        List<Book> listFromCustomMethod = bookRepository.selectAllBooksUsingQueryFromRepository();

        // Then
        assertEquals(listFromCRUDmethod.size(), listFromCustomMethod.size());
    }

    /*
        TODO 17 zaimplementuj test
     */
    @Test
    @DirtiesContext
    public void selectAllBooksUsingQueryFromEntity() {
        // Given
        List<Book> booksToBeSaved = createBooksWithAuthor(10);
        booksToBeSaved.stream().forEach(bookRepository::save);
        List<Book> listFromCRUDmethod = convertIterableToList(bookRepository.findAll());

        // When
        List<Book> listFromCustomMethod = bookRepository.selectAllBooksUsingQueryFromEntity();

        // Then
        assertEquals(listFromCRUDmethod.size(), listFromCustomMethod.size());
    }

//=========================================================    Helper methods
    private Book createBookWithAuthor(int no) {
        Author author = new Author("Author_name_"+no, "Author_lastName_"+no, null);
        Book book = new Book("Tytuł_"+no, "ISBN_"+no, author);
        List<Book> books = new ArrayList<Book>();
        books.add(book);
        author.setBooks(books);
        return book;
    }

    private List<Book> createBooksWithAuthor(int howMany) {
        List<Book> books = new ArrayList<>();
        for(int i = 1; i <= howMany; i++) {
            books.add(createBookWithAuthor(i));
        }
        return books;
    }

    private <T> List<T> convertIterableToList(Iterable<T> iterable) {
        List<T> list = new ArrayList<>();
        iterable.forEach(list::add);
        return list;
    }
}