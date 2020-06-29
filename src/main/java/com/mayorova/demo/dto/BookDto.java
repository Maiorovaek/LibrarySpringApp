package com.mayorova.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

public class BookDto implements Serializable {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("genre")
    private Genre genre;
    @JsonProperty("title")
    private String title;
    @JsonProperty("number_pages")
    private int numberPages;
    @JsonProperty("count")
    private int count;
    @JsonProperty("published_date")
    private LocalDate publishedDate;
    @JsonIgnore
    private Set<AuthorDto> authors;
    @JsonIgnore
    private Set<DeliveryDto> deliveryDto;

    public Set<DeliveryDto> getDeliveryDto() {
        return deliveryDto;
    }

    public void setDeliveryDto(Set<DeliveryDto> deliveryDto) {
        this.deliveryDto = deliveryDto;
    }

    public Set<AuthorDto> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<AuthorDto> authors) {
        this.authors = authors;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
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

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }
}
