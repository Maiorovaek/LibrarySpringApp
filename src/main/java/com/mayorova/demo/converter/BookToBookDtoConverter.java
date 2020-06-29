package com.mayorova.demo.converter;


import com.mayorova.demo.dto.BookDto;
import com.mayorova.demo.entity.Book;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BookToBookDtoConverter implements Converter<Book, BookDto> {

    private final ConversionService conversionService;

    public BookToBookDtoConverter(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @Override
    public BookDto convert(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setCount(book.getCount());
        bookDto.setGenre(book.getGenre());
        bookDto.setNumberPages(book.getNumberPages());
        bookDto.setPublishedDate(book.getPublishedDate());
        bookDto.setTitle(book.getTitle());
        bookDto.setId(book.getId());
        return bookDto;
    }
}