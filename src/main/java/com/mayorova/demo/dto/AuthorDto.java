package com.mayorova.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class AuthorDto extends PersonDto implements Serializable {


    public AuthorDto(long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public AuthorDto() {
    }
}
