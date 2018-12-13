package workshop.spring5.persistence.hibernate.model;

/*
    TODO 12, analogicznie jak encja Book, opis poniżej
 */
public class Author {

    /*
        nazwa tabeli author

        pola klasy:
        id:Long
        name:String
        lastName:String
        books:List<Book>

        nazwa kolumny id - author_id

        adnotacja dla books
                        @OneToMany
                                  mappedBy - author
                                  cascade -  CascadeType.ALL
     */
}
