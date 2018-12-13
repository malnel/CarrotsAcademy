package workshop.spring5.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Book {

    @NotNull
    @Min(100)
    private Long id;
    @NotNull
    @Size(min=2, max=30)
    private String title;
    @NotNull
    @Size(min=2, max=10)
    private String isbn;
    @NotNull
    @Size(min=2, max=30)
    private String author;

    public Book() {
    }

    public Book(Long id, String title, String isbn, String author) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}