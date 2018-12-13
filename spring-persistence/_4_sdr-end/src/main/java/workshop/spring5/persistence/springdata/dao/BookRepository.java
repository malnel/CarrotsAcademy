package workshop.spring5.persistence.springdata.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import workshop.spring5.persistence.springdata.model.Book;

import javax.persistence.NamedQuery;
import java.util.List;

/*
    TODO 7 zmień interfejs na repozytorium Springow'e
    Interfejs rozszerza org.springframework.data.repository.CrudRepository
    <T, ID> : typ encji, typ klucza w encji
 */
public interface BookRepository extends CrudRepository<Book, Long> {

    /*
        TODO 14 zadeklaruj metodę List<Book> selectAllBooksUsingQueryFromEntity()
        Użyj adnotacji @Query -  wykorzystaj definicję z encji
     */
    @Query(name = "myNativeQueryFromEntity")
    List<Book> selectAllBooksUsingQueryFromEntity();


    /*
        TODO 15 zadeklaruj metodę List<Book> selectAllBooksUsingQueryFromRepository()
        Użyj adnotacji @Query(value=("..."))
    */
    @Query(value = "select b from Book b")
    List<Book> selectAllBooksUsingQueryFromRepository();

}
