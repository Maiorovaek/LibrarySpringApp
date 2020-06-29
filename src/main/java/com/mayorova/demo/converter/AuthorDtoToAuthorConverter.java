package com.mayorova.demo.converter;

import com.mayorova.demo.dto.AuthorDto;
import com.mayorova.demo.entity.Author;
import com.mayorova.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class AuthorDtoToAuthorConverter implements Converter<AuthorDto, Author> {
    private ConversionService conversionService;

    @Autowired
    public AuthorDtoToAuthorConverter(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @Override
    public Author convert(AuthorDto authorDto) {
        Author author = new Author();
        author.setFirstName(authorDto.getFirstName());
        author.setLastName(authorDto.getLastName());
        author.setId(authorDto.getId());
        author.setBooks(authorDto.getBookDtoSet().stream()
                .map(book -> conversionService.convert(book, Book.class)).collect(Collectors.toSet()));
        return author;
    }

}