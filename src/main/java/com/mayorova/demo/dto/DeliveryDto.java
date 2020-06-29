package com.mayorova.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.LocalDate;

public class DeliveryDto implements Serializable {
    @JsonProperty("id_delivery")
    private Long idDelivery;
    @JsonIgnore
    private BookDto books;
    @JsonProperty("librarian")
    private LibrarianDto librarianDto;
    @JsonProperty("reader")
    private ReaderDto readerDto;
    @JsonProperty("delivery_date")
    private LocalDate deliveryDate;
    @JsonProperty("return_date")
    private LocalDate returnDate;

    public ReaderDto getReaderDto() {
        return readerDto;
    }

    public void setReaderDto(ReaderDto readerDto) {
        this.readerDto = readerDto;
    }

    public Long getIdDelivery() {
        return idDelivery;
    }

    public void setIdDelivery(Long idDelivery) {
        this.idDelivery = idDelivery;
    }

    public LibrarianDto getLibrarianDto() {
        return librarianDto;
    }

    public void setLibrarianDto(LibrarianDto librarianDto) {
        this.librarianDto = librarianDto;
    }

    public BookDto getBooks() {
        return books;
    }

    public void setBooks(BookDto books) {
        this.books = books;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
