package com.rental.busRental.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="busId")
    private Long busId;

    @OneToMany(mappedBy = "bus",cascade = CascadeType.ALL)
    private Set<Booking> bookingSet =new HashSet<>();

    private String busNumber;

    private String startDestination;

    private String endDestination;

    private String startTime;

    private String departureDate;

    private float ticketPrice;

    private int totalSeats;

    private int availableSeats;

    private Long contactNumber;

    public Bus(){

    }

    public Bus(Long busId, String busNumber, String startDestination, String endDestination, String startTime, String departureDate, float ticketPrice, int totalSeats, int availableSeats, Long contactNumber) {
        this.busId = busId;
        this.busNumber = busNumber;
        this.startDestination = startDestination;
        this.endDestination = endDestination;
        this.startTime = startTime;
        this.departureDate = departureDate;
        this.ticketPrice = ticketPrice;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
        this.contactNumber = contactNumber;
    }

    public Long getBusId() {
        return busId;
    }

    public void setBusId(Long busId) {
        this.busId = busId;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getStartDestination() {
        return startDestination;
    }

    public void setStartDestination(String startDestination) {
        this.startDestination = startDestination;
    }

    public String getEndDestination() {
        return endDestination;
    }

    public void setEndDestination(String endDestination) {
        this.endDestination = endDestination;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }
}
