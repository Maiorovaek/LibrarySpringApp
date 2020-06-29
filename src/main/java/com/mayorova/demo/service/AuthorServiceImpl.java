package com.mayorova.demo.service;

import com.mayorova.demo.dto.AuthorDto;
import com.mayorova.demo.entity.Author;
import com.mayorova.demo.repository.AuthorRepository;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    private final ConversionService conversionService;

    public AuthorServiceImpl(AuthorRepository authorRepository, ConversionService conversionService) {
        this.authorRepository = authorRepository;
        this.conversionService = conversionService;
    }

    @Override
    public AuthorDto createAuthor(AuthorDto authorDto) {
        Author author = conversionService.convert(authorDto, Author.class);
        return conversionService.convert(authorRepository.save(author), AuthorDto.class);
    }

    @Override
    public void deleteById(Long id) {
        Author author = authorRepository.findById(id).get();
        authorRepository.delete(author);
    }

    @Override
    public AuthorDto getById(Long id) {
        Author author = authorRepository.findById(id).get();
        return conversionService.convert(author, AuthorDto.class);
    }

    @Override
    public List<AuthorDto> getAll() {
        List<Author> authors = authorRepository.findAll();
        return authors.stream().map(author -> conversionService.convert(author, AuthorDto.class)).collect(Collectors.toList());
    }

    @Override
    public AuthorDto updateAuthor(AuthorDto authorDto) {
        Author author = authorRepository.findById(authorDto.getId()).get();
        author = conversionService.convert(authorDto, Author.class );
        return conversionService.convert(authorRepository.save(author), AuthorDto.class);
    }
}
