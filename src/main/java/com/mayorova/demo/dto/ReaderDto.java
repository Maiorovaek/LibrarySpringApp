package com.mayorova.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


public class ReaderDto extends PersonDto implements Serializable {

    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("address")
    private AddressDto address;

    public ReaderDto(long numberReaderTicket, String firstName, String lastName, String phoneNumber, AddressDto address) {
        super(numberReaderTicket, firstName, lastName);
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public ReaderDto() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

}
