package com.mayorova.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Set;

public class AuthorDto extends PersonDto implements Serializable {

    @JsonProperty("books")
    Set<BookDto> bookDtoSet;

    public Set<BookDto> getBookDtoSet() {
        return bookDtoSet;
    }

    public void setBookDtoSet(Set<BookDto> bookDtoSet) {
        this.bookDtoSet = bookDtoSet;
    }
}
