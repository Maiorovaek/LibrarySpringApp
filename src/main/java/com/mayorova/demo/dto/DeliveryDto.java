package com.mayorova.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.LocalDate;

public class DeliveryDto implements Serializable {
    @JsonProperty("id_delivery")
    private long idDelivery;
    @JsonProperty("id_book")
    private BookDto idBook;
    @JsonProperty("librarian")
    private LibrarianDto librarian;
    @JsonProperty("number_reader_ticket")
    private ReaderDto numberReaderTicket;
    @JsonProperty("delivery_date")
    private LocalDate deliveryDate;
    @JsonProperty("return_date")
    private LocalDate returnDate;


    public DeliveryDto() {
    }

    public DeliveryDto(long idDelivery, BookDto idBook, LibrarianDto librarian, ReaderDto numberReaderTicket, LocalDate deliveryDate, LocalDate returnDate) {
        this.idDelivery = idDelivery;
        this.idBook = idBook;
        this.librarian = librarian;
        this.numberReaderTicket = numberReaderTicket;
        this.deliveryDate = deliveryDate;
        this.returnDate = returnDate;
    }

    public LibrarianDto getLibrarian() {
        return librarian;
    }

    public void setLibrarian(LibrarianDto librarian) {
        this.librarian = librarian;
    }

    public long getIdDelivery() {
        return idDelivery;
    }

    public void setIdDelivery(long idDelivery) {
        this.idDelivery = idDelivery;
    }

    public BookDto getIdBook() {
        return idBook;
    }

    public void setIdBook(BookDto idBook) {
        this.idBook = idBook;
    }

    public ReaderDto getNumberReaderTicket() {
        return numberReaderTicket;
    }

    public void setNumberReaderTicket(ReaderDto numberReaderTicket) {
        this.numberReaderTicket = numberReaderTicket;
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
