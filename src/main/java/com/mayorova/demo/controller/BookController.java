package com.mayorova.demo.controller;

import com.mayorova.demo.dto.AuthorDto;
import com.mayorova.demo.dto.BookDto;
import com.mayorova.demo.dto.Genre;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/books")
@RestController
public class BookController {
    private static List<BookDto> bookList = Arrays.asList(new BookDto(2, Genre.DETECTIVE_FICTION, "Remember my words", new AuthorDto(2, "James ", "Chase"), 52, 1, LocalDate.of(2020, 6, 7)));

    public BookController() {
    }

    @GetMapping(value = "/{id}")
    public BookDto getBook(@PathVariable int id) {
        return bookList.get(id);
    }

    @GetMapping
    public List<BookDto> getAllBooks() {
        return bookList;
    }

    @PutMapping
    public BookDto updateBook(@RequestBody BookDto book) {

        return null;
    }

    @DeleteMapping
    public void deleteBook(@PathParam("id") Long id) {
    }

    @PostMapping
    public BookDto createBook(BookDto book) {
        return null;
    }
}

