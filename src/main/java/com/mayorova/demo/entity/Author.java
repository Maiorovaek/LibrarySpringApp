package com.mayorova.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@DiscriminatorValue(value = "authors")
@PrimaryKeyJoinColumn(name = "authors_id")
public class Author extends Person {

    @ManyToMany(mappedBy = "authors")
    Set<Book> books;

    public Author() {
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
