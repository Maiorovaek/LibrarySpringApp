package com.mayorova.demo.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "librarians")
public class Librarian extends Person {

    public Librarian() {
    }

    @OneToOne(mappedBy = "librarian")
    private Delivery delivery;

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
}
