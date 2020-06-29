package com.mayorova.demo.service;

import com.mayorova.demo.dto.AuthorDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {
    AuthorDto createAuthor(AuthorDto authorDto);

    void deleteById(Long id);

    AuthorDto getById(Long id);

    List<AuthorDto> getAll();

    AuthorDto updateAuthor(AuthorDto authorDto);
}
