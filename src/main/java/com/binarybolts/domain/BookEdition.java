package com.binarybolts.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class BookEdition {

    @Id
    private Long id;

    private Long isbn13;
    private Long isbn10;
    private String title;

    @ManyToOne
    @JoinColumn(name = "book_edition_id")
    private Book book;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(Long isbn13) {
        this.isbn13 = isbn13;
    }

    public Long getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(Long isbn10) {
        this.isbn10 = isbn10;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
