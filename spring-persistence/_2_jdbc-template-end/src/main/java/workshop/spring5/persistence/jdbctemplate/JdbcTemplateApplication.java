package workshop.spring5.persistence.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import workshop.spring5.persistence.jdbctemplate.config.MainConfig;
import workshop.spring5.persistence.jdbctemplate.dao.BookRepositoryImpl;
import workshop.spring5.persistence.jdbctemplate.model.Book;

public class JdbcTemplateApplication {
    public static void main(String[] args) {
        /*
            TODO 4 Wydrukuj do konsoli Book, używająć bookRepository wyszukanego w kontekście Spring'a
                                                utwórz ApplicationContext używając MainConfig
                                                wyszukaj w kontekście bookRepository i wywołaj na nim metodę getBook
                                                wydrukuj do konsoli wartośc zwracaną przez getBook
         */
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        BookRepositoryImpl bookRepository = ctx.getBean("bookRepository", BookRepositoryImpl.class);
        System.out.println(bookRepository.getBook(1));
        System.out.println("###############################################################################");
        /*
            TODO 10 wywołanie metody dao, zwracającej String
                wywołaj metodę getBookNameById i wypisz zwracaną wartość do konsoli

          */
        System.out.println(bookRepository.getBookNameById(1));
        System.out.println("###############################################################################");
        /*

            TODO 13 wywołanie metody dao, zwracającej obiekt Book
                wywołaj metodę getBookById i wypisz zwracaną wartość do konsoli
         */
        System.out.println(bookRepository.getBookById(1));
        System.out.println("###############################################################################");

        /*

            TODO 15 wywołanie metody dao, zwracającej ilość rekordów w tabeli
                wywołaj metodę getSize i wypisz zwracaną wartość do konsoli
         */
        System.out.println(bookRepository.getSize());
        System.out.println("###############################################################################");
        /*

            TODO 17 wywołanie metody dao, tworzącej nowy rekord w tabeli
                Pobierz rozmiar tabeli i wydrukuj do konsoli
                Utwórz obiekt Book (id = rozmiar tabeli + 1).
                Wywołaj metodę dao insertBook.
                Wywołaj metodę getSize i wypisz zwracaną wartość do konsoli
         */
        int counter = bookRepository.getSize();
        System.out.println(counter);
        ++counter;
        bookRepository.insertBook(new Book(counter, "another title"+counter, "another isbn"+counter,"another author"+counter));
        System.out.println(bookRepository.getSize());
        System.out.println("###############################################################################");
        /*

            TODO 21 wywołanie metody dao,

         */
        System.out.println(bookRepository.getByTitleAndAuthor("another title"+counter, "another author"+counter));
        System.out.println("###############################################################################");
    }

}
