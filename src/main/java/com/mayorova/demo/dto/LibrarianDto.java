package com.mayorova.demo.dto;

import java.io.Serializable;

public class LibrarianDto extends PersonDto implements Serializable {

    public LibrarianDto(long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public LibrarianDto() {
    }
}
