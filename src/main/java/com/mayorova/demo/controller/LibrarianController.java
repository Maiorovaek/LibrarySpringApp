package com.mayorova.demo.controller;

import com.mayorova.demo.dto.LibrarianDto;
import com.mayorova.demo.service.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/librarians")
@RestController
public class LibrarianController {
    private final LibrarianService librarianService;

    @Autowired
    public LibrarianController(LibrarianService librarianService) {
        this.librarianService = librarianService;
    }

    @GetMapping(value = "/{id}")
    public LibrarianDto getLibrarian(@PathVariable("id") Long id) {
        return librarianService.getById(id);
    }

    @GetMapping
    public List<LibrarianDto> getAllLibrarian() {
        return librarianService.getAll();
    }

    @PutMapping
    public LibrarianDto updateLibrarian(@RequestBody LibrarianDto librarian) {
        return librarianService.updateLibrarian(librarian);
    }

    @DeleteMapping
    public void deleteLibrarian(@PathParam("id") Long id) {
        librarianService.deleteById(id);
    }

    @PostMapping
    public LibrarianDto createLibrarian(@RequestBody LibrarianDto librarianDto) {
        return librarianService.createLibrarian(librarianDto);
    }
}
