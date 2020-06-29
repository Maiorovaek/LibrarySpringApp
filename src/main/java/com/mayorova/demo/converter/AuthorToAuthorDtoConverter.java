package com.mayorova.demo.converter;

import com.mayorova.demo.dto.AuthorDto;
import com.mayorova.demo.dto.BookDto;
import com.mayorova.demo.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class AuthorToAuthorDtoConverter implements Converter<Author, AuthorDto> {

    private ConversionService conversionService;

    @Autowired
    public AuthorToAuthorDtoConverter(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @Override
    public AuthorDto convert(Author author) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setFirstName(author.getFirstName());
        authorDto.setLastName(author.getLastName());
        authorDto.setId(author.getId());
        authorDto.setBookDtoSet(author.getBooks().stream()
                .map(bookDto -> conversionService.convert(bookDto, BookDto.class)).collect(Collectors.toSet()));
        return authorDto;
    }
}