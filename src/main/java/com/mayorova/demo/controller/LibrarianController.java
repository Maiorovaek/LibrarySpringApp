package com.mayorova.demo.controller;

import com.mayorova.demo.dto.LibrarianDto;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/librarians")
@RestController
public class LibrarianController {

    private List<LibrarianDto> librarianList = Arrays.asList(new LibrarianDto(1, "Yuriy", "Somov"), new LibrarianDto(2, "Gregory", "Sharov"));

    public LibrarianController() {
    }

    @GetMapping(value = "/{id}")
    public LibrarianDto getLibrarian(@PathVariable int id) {
        return librarianList.get(id);
    }

    @GetMapping
    public List<LibrarianDto> getAllLibrarian() {
        return librarianList;
    }

    @PutMapping
    public LibrarianDto updateLibrarian(@RequestBody LibrarianDto librarian) {
        return null;
    }

    @DeleteMapping
    public void deleteLibrarian(@PathParam("id") Long id) {
    }

    @PostMapping
    public LibrarianDto createLibrarian(LibrarianDto librarian) {
        return null;
    }
}
