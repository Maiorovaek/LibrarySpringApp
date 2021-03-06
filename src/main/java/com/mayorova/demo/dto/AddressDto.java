package com.mayorova.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class AddressDto implements Serializable {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("street")
    private String street;
    @JsonProperty("city")
    private String city;
    @JsonProperty("number_house")
    private Long numberHouse;
    @JsonProperty("number_flat")
    private Long numberFlat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(Long numberHouse) {
        this.numberHouse = numberHouse;
    }

    public Long getNumberFlat() {
        return numberFlat;
    }

    public void setNumberFlat(Long numberFlat) {
        this.numberFlat = numberFlat;
    }
}
