package com.mayorova.demo.service;

import com.mayorova.demo.dto.LibrarianDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LibrarianService {
    LibrarianDto createLibrarian(LibrarianDto librarianDto);

    void deleteById(Long id);

    LibrarianDto getById(Long id);

    List<LibrarianDto> getAll();

    LibrarianDto updateLibrarian(LibrarianDto librarian);
}
