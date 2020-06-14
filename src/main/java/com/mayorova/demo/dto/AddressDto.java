package com.mayorova.demo.dto;

import java.io.Serializable;

public class AddressDto implements Serializable {
    private int id;
    private String street;
    private String city;
    private int numberHouse;
    private int numberFlat;

    public AddressDto() {
    }

    public AddressDto(int id, String street, String city, int numberHouse, int numberFlat) {
        this.id =id;
        this.street = street;
        this.city = city;
        this.numberHouse = numberHouse;
        this.numberFlat = numberFlat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }

    public int getNumberFlat() {
        return numberFlat;
    }

    public void setNumberFlat(int numberFlat) {
        this.numberFlat = numberFlat;
    }
}
