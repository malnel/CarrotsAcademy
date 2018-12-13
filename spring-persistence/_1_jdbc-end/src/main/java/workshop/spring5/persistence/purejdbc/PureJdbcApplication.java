package workshop.spring5.persistence.purejdbc;

import workshop.spring5.persistence.purejdbc.dao.BookRepositoryImpl;

public class PureJdbcApplication {
    public static void main(String[] args) {
        System.out.println(new BookRepositoryImpl().getBook(1));
    }

}
