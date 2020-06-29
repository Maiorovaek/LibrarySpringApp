package com.mayorova.demo.service;

import com.mayorova.demo.dto.BookDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    BookDto createBook(BookDto bookDto);

    void deleteById(Long id);

    BookDto getById(Long id);

    List<BookDto> getAll();

    BookDto updateBook(BookDto bookDto);
}
