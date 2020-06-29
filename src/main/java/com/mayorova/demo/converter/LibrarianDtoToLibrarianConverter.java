package com.mayorova.demo.converter;


import com.mayorova.demo.dto.LibrarianDto;
import com.mayorova.demo.entity.Librarian;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LibrarianDtoToLibrarianConverter implements Converter<LibrarianDto, Librarian> {
    @Override
    public Librarian convert(LibrarianDto librarianDto) {
        Librarian librarian = new Librarian();
        librarian.setFirstName(librarianDto.getFirstName());
        librarian.setLastName(librarianDto.getLastName());
        librarian.setId(librarianDto.getId());
        return librarian;
    }
}
