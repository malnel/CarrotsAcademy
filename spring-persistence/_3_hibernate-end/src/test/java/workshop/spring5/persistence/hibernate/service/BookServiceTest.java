package workshop.spring5.persistence.hibernate.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateOptimisticLockingFailureException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import workshop.spring5.persistence.hibernate.config.MainConfig;
import workshop.spring5.persistence.hibernate.model.Author;
import workshop.spring5.persistence.hibernate.model.Book;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MainConfig.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void shouldSaveABook() {
        // Given
        int booksInDB = bookService.list().size();
        Book book = createBookWithAuthor(booksInDB+1);

        // When
        Long  savedBookId = bookService.save(book);

        // Then
        assertEquals(booksInDB+1, bookService.list().size());
    }

    @Test
    public void shouldNotFindABook() {
        // Given
        long nonExistingId = 1231241421352L;

        // When
        Book returnedBook = bookService.findById(nonExistingId);

        // Then
        assertNull(returnedBook);
    }

    @Test
    public void shouldFindABook() {
        // Given
        int nextBookNumber = bookService.list().size() + 1;
        Book book = createBookWithAuthor(nextBookNumber);
        Long  savedBookId = bookService.save(book);

        // When
        Book bookFromDB = bookService.findById(savedBookId);

        // Then
        assertNotNull(bookFromDB);
    }

    @Test
    public void shouldListAllAfterSave() {
        // Given
        int listSize = bookService.list().size();
        int _1stBookNumber = listSize+1;
        int _2ndBookNumber = listSize+2;
        Book book1 = createBookWithAuthor(_1stBookNumber);
        Book book2 = createBookWithAuthor(_2ndBookNumber);
        bookService.save(book1);
        bookService.save(book2);

        // When
        int afterSaveListSize = bookService.list().size();

        // Then
        assertEquals(listSize+2, afterSaveListSize);

    }

    @Test
    public void shouldUpdateBook() {
        // Given
        int booksInDB = bookService.list().size();
        Book book = createBookWithAuthor(booksInDB+1);
        Long  savedBookId = bookService.save(book);

        // When
        Book savedBook = bookService.findById(savedBookId);
        savedBook.setTitle("Updated title");
        bookService.update(savedBook);

        // Then
        assertEquals(savedBook.getTitle(), bookService.findById(savedBookId).getTitle());
    }

    @Test(expected = HibernateOptimisticLockingFailureException.class)
    public void shouldThrowExceptionForNonExistingBook() {
        // Given
        Book nonexistingBook = new Book();
        // When
        bookService.update(nonexistingBook);

        // Then expect HibernateOptimisticLockingFailureException
    }

    @Test
    public void shouldDeleteBook() {
        // Given
        Book book = createBookWithAuthor(0);
        Long  savedBookId = bookService.save(book);
        assertNotNull(bookService.findById(savedBookId));
        // When
        bookService.deleteById(savedBookId);
        // Then
        assertNull(bookService.findById(savedBookId));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shoulddThrowExceptionWhileDeletingForNonExistingId() {
        // Given
        Long nonExistingID = 123456789L;
        assertNull(bookService.findById(nonExistingID));
        // When
        bookService.deleteById(nonExistingID);
        // Then expect IllegalArgumentException
    }

    // ============================================= helper methods ==============================================//
    private Book createBookWithAuthor(int bookNumber) {
        Author author = new Author("Author_name_"+bookNumber, "Author_lastName_"+bookNumber, null);
        Book book = new Book("Tytuł_"+bookNumber, "ISBN_"+bookNumber, author);
        List<Book> books = new ArrayList<>();
        books.add(book);
        author.setBooks(books);
        return book;
    }
}