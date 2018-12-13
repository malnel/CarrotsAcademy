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

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MainConfig.class)
public class AuthorServiceTest {

    @Autowired
    private AuthorService authorService;


    @Test
    public void shouldSaveAuthor() {
        // Given
        int authorsInDB = authorService.list().size();
        Author author = createAuthorWithBook(authorsInDB + 1);

        // When
        Long savedBookId = authorService.save(author);

        // Then
        assertEquals(authorsInDB + 1, authorService.list().size());
    }

    @Test
    public void shouldNotFindAuthor() {
        // Given
        long nonExistingId = 1231241421352L;

        // When
        Author authorFromDb = authorService.findById(nonExistingId);

        // Then
        assertNull(authorFromDb);
    }

    @Test
    public void shouldFindAuthor() {
        // Given
        int nextAuthorNumber = authorService.list().size() + 1;
        Author author = createAuthorWithBook(nextAuthorNumber);
        Long savedAuthorkId = authorService.save(author);

        // When
        Author authorFormDB = authorService.findById(savedAuthorkId);

        // Then
        assertNotNull(authorFormDB);
    }

    @Test
    public void shouldListAllAfterSave() {
        // Given
        int listSize = authorService.list().size();
        int _1stAuthorNumber = listSize + 1;
        int _2ndAuthorNumber = listSize + 2;
        Author author1 = createAuthorWithBook(_1stAuthorNumber);
        Author author2 = createAuthorWithBook(_2ndAuthorNumber);
        authorService.save(author1);
        authorService.save(author2);

        // When
        int afterSaveListSize = authorService.list().size();

        // Then
        assertEquals(listSize + 2, afterSaveListSize);

    }

    @Test
    public void shouldUpdateAuthor() {
        // Given
        int authorNumbers = authorService.list().size();
        Author author = createAuthorWithBook(authorNumbers + 1);
        Long savedAuthorId = authorService.save(author);

        // When
        Author savedAuthor = authorService.findById(savedAuthorId);
        savedAuthor.setName("Updated name");
        authorService.update(savedAuthor);

        // Then
        assertEquals(savedAuthor.getName(), authorService.findById(savedAuthorId).getName());
    }

    @Test(expected = HibernateOptimisticLockingFailureException.class)
    public void shouldThrowExceptionForUpdateWithNonExistingAuthor() {
        // Given
        Author nonexistingAuthor = new Author();
        // When
        authorService.update(nonexistingAuthor);

        // Then expect HibernateOptimisticLockingFailureException
    }

    @Test
    public void shouldDeleteAuthor() {
        // Given
        Author author = createAuthorWithBook(0);
        Long savedAuthorId = authorService.save(author);
        assertNotNull(authorService.findById(savedAuthorId));
        // When
        authorService.deleteById(savedAuthorId);
        // Then
        assertNull(authorService.findById(savedAuthorId));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shoulddThrowExceptionForDeleteWithNonExistingId() {
        // Given
        Author author = createAuthorWithBook(0);
        Long savedAuthorId = authorService.save(author);
        assertNotNull(authorService.findById(savedAuthorId));
        // When
        authorService.deleteById(123445);
        // Then expect IllegalArgumentException
    }

    // ============================================= helper methods ==============================================//
    private Author createAuthorWithBook(int authorNumber) {
        Author author = new Author("Author_name_" + authorNumber, "Author_lastName_" + authorNumber, null);
        Book book = new Book("Tytuł_" + authorNumber, "ISBN_" + authorNumber, author);
        List<Book> books = new ArrayList<>();
        books.add(book);
        author.setBooks(books);
        return author;
    }

}