package workshop.spring5.customconverter.model;

public class Book {

    private String title;
    private String isbn;
    private String author;
    private String rating;

    public Book() {
    }

    public Book(String title, String isbn, String author, String rating) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getRating() {
        return rating;
    }
}
