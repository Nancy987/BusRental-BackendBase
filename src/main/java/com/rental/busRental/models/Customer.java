package com.rental.busRental.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="customerId")
    private Long customerId;

    @OneToMany(mappedBy="customer",cascade = CascadeType.ALL)
    private Set<Booking> bookingSet = new HashSet<>();

    private String customerName;

    private String emailId;

    private String password;

    public Customer() {
    }

    public Customer(Long customerId, Set<Booking> bookingSet, String customerName, String emailId, String password) {
        this.customerId = customerId;
        this.bookingSet = bookingSet;
        this.customerName = customerName;
        this.emailId = emailId;
        this.password = password;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Set<Booking> getBookingSet() {
        return bookingSet;
    }

    public void setBookingSet(Set<Booking> bookingSet) {
        this.bookingSet = bookingSet;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
