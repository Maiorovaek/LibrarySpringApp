package com.mayorova.demo.converter;

import com.mayorova.demo.dto.BookDto;
import com.mayorova.demo.entity.Book;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
public class
BookDtoToBookConverter implements Converter<BookDto, Book> {
    private final ConversionService conversionService;

    public BookDtoToBookConverter(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @Override
    public Book convert(BookDto bookDto) {
        Book book = new Book();
        book.setCount(bookDto.getCount());
        book.setGenre(bookDto.getGenre());
        book.setNumberPages(bookDto.getNumberPages());
        book.setPublishedDate(bookDto.getPublishedDate());
        book.setTitle(bookDto.getTitle());
        book.setId(bookDto.getId());
        return book;
    }
}
