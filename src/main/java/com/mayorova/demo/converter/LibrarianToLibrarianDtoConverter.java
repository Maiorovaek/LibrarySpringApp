package com.mayorova.demo.converter;

import com.mayorova.demo.dto.LibrarianDto;
import com.mayorova.demo.entity.Librarian;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LibrarianToLibrarianDtoConverter implements Converter<Librarian, LibrarianDto> {
    @Override
    public LibrarianDto convert(Librarian librarian) {
        LibrarianDto librarianDto = new LibrarianDto();
        librarianDto.setFirstName(librarian.getFirstName());
        librarianDto.setLastName(librarian.getLastName());
        librarianDto.setId(librarian.getId());
        return librarianDto;
    }
}