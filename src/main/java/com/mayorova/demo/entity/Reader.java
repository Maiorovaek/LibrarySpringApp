package com.mayorova.demo.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "readers")
@PrimaryKeyJoinColumn(name = "id")
public class Reader extends Person {
    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    public Reader() {
    }

    @OneToOne(mappedBy = "reader", cascade = CascadeType.ALL)
    private Delivery delivery;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
