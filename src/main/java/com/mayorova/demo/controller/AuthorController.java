package com.mayorova.demo.controller;

import com.mayorova.demo.dto.AuthorDto;
import com.mayorova.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RequestMapping("/authors")
@RestController
public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<AuthorDto> getAllAuthors() {
        return authorService.getAll();
    }

    @PutMapping
    public AuthorDto updateAuthor(@RequestBody AuthorDto authorDto) {
        return authorService.updateAuthor(authorDto);
    }

    @DeleteMapping(value ="/{id}")
    public void deleteAuthor(@PathVariable("id") Long id) {
        authorService.deleteById(id);
    }

    @GetMapping(value = "/{id}")
    public AuthorDto getAuthorById(@PathVariable("id") Long id) {
        return authorService.getById(id);
    }

    @PostMapping
    public AuthorDto createAuthor(@RequestBody AuthorDto authorDto) {
        return authorService.createAuthor(authorDto);
    }
}
