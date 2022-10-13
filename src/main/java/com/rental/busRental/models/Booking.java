package com.rental.busRental.models;


import javax.persistence.*;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name="customerId")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="busId")
    private Bus bus;

    public Booking() {
    }

    public Booking(Long bookingId, Customer customer, Bus bus) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.bus = bus;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
}
