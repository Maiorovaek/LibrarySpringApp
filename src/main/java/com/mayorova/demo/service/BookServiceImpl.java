package com.mayorova.demo.service;

import com.mayorova.demo.dto.BookDto;
import com.mayorova.demo.entity.Author;
import com.mayorova.demo.entity.Book;
import com.mayorova.demo.repository.BookRepository;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final ConversionService conversionService;

    public BookServiceImpl(BookRepository bookRepository, ConversionService conversionService) {
        this.bookRepository = bookRepository;
        this.conversionService = conversionService;
    }

    @Override
    public BookDto createBook(BookDto bookDto) {
        Book book  = conversionService.convert(bookDto, Book.class);
        return conversionService.convert(bookRepository.save(book), BookDto.class);
    }

    @Override
    public void deleteById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book is not found"));
        bookRepository.delete(book);
    }

    @Override
    public BookDto getById(Long id) {
        Book book = bookRepository.findById(id).get();
        return conversionService.convert(book, BookDto.class);
    }

    @Override
    public List<BookDto> getAll() {
        List<Book> books = bookRepository.findAll();
        return books.stream().map(book -> conversionService.convert(book, BookDto.class)).collect(Collectors.toList());
    }

    @Override
    public BookDto updateBook(BookDto bookDto) {
        Book book = bookRepository.findById(bookDto.getId()).get();
        book.setCount(bookDto.getCount());
        book.setGenre(bookDto.getGenre());
        book.setNumberPages(bookDto.getNumberPages());
        book.setPublishedDate(bookDto.getPublishedDate());
        book.setTitle(bookDto.getTitle());
        return conversionService.convert(bookRepository.save(book), BookDto.class);
    }
}
