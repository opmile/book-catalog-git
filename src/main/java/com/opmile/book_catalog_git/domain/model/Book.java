package com.opmile.book_catalog_git.domain.model;

public class Book {

    private Long id;

    private String title;

    private Integer publicationYear;

    private String isbn;

    private Author author;

    public Book() {}

    public Book(String title, Integer publicationYear, String isbn, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
