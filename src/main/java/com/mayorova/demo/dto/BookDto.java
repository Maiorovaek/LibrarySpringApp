package com.mayorova.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.LocalDate;

public class BookDto implements Serializable {
    @JsonProperty("id")
    private long id;
    @JsonProperty("genre")
    private Genre genre;
    @JsonProperty("title")
    private String title;
    @JsonProperty("author")
    private AuthorDto author;
    @JsonProperty("number_pages")
    private int numberPages;
    @JsonProperty("count")
    private int count;
    @JsonProperty("published_date")
    private LocalDate published_date;

    public BookDto() {
    }

    public BookDto(long id, Genre genre, String title, AuthorDto author, int numberPages, int count, LocalDate published_date) {
        this.id = id;
        this.genre = genre;
        this.title = title;
        this.author = author;
        this.numberPages = numberPages;
        this.count = count;
        this.published_date = published_date;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AuthorDto getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDto author) {
        this.author = author;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LocalDate getPublished_date() {
        return published_date;
    }

    public void setPublished_date(LocalDate published_date) {
        this.published_date = published_date;
    }
}
