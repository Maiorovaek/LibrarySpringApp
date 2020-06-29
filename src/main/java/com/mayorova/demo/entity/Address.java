package com.mayorova.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address extends EntityBase {
    @Column(name = "street")
    private String street;
    @Column(name = "city")
    private String city;
    @Column(name = "number_house")
    private Long numberHouse;
    @Column(name = "number_flat")
    private Long numberFlat;

    @OneToOne(mappedBy = "address")
    private Reader reader;

    public Address() {
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

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }
}
