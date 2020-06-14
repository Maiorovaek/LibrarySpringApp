package com.mayorova.demo.controller;

import com.mayorova.demo.dto.AuthorDto;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.*;

@RequestMapping("/authors")
@RestController
public class AuthorController {
    private List<AuthorDto> authorList = Arrays.asList(new AuthorDto(1, "Joanne", "Rowling"), new AuthorDto(2, "James", "Chase"));

    public AuthorController() {
    }

    @GetMapping(value = "/{id}")
    public AuthorDto getDelivery(@PathVariable int id) {
        return authorList.get(id);
    }

    @GetMapping
    public List<AuthorDto> getAllAuthors() {
        return authorList;
    }

    @PutMapping
    public AuthorDto updateAuthor(@RequestBody AuthorDto author) {
        return null;
    }

    @DeleteMapping
    public void deleteAuthor(@PathParam("id") Long id) {

    }

    @PostMapping
    public AuthorDto createAuthor( AuthorDto author) {
        return null;
    }
}
