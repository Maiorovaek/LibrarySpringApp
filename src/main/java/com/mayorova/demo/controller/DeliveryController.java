package com.mayorova.demo.controller;

import com.mayorova.demo.dto.*;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/deliveries")
@RestController
public class DeliveryController {
    private static BookDto book = new BookDto(2, Genre.FANTASY, "Harry Potter", new AuthorDto(1, "Joanne", "Rowling"), 1088, 2, LocalDate.of(2020, 6, 7));
    private static LibrarianDto librarian = new LibrarianDto(2, "Gregory", "Sharov");
    private static ReaderDto reader = new ReaderDto(27, "Yulia", "Torina", "89765889687", new AddressDto(8,"N.Novgorod", "Gagarina", 187, 35));

    private static List<DeliveryDto> deliveryList = Arrays.asList(
            new DeliveryDto(1, book, librarian, reader, LocalDate.of(2020, 6, 11), LocalDate.now()));

    public DeliveryController() {
    }

    @GetMapping(value = "/{id}")
    public DeliveryDto getDelivery(@PathVariable int id) {
        return deliveryList.get(id);
    }

    @GetMapping
    public List<DeliveryDto> getAllDelivery() {
        return deliveryList;
    }

    @PutMapping
    public DeliveryDto updateDelivery(@RequestBody DeliveryDto delivery) {
        return null;
    }

    @DeleteMapping
    public void deleteDelivery(@PathParam("id") Long id) {
    }

    @PostMapping
    public DeliveryDto createDelivery(DeliveryDto delivery) {
        return null;
    }
}
