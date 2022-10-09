package com.rental.busRental.controllers;

import com.rental.busRental.models.Booking;
import com.rental.busRental.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Booking")
public class BookingController {
    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService){
        this.bookingService=bookingService;
    }

    @PostMapping
    public ResponseEntity<Booking> addBooking(@RequestBody Booking booking){
        return new ResponseEntity<Booking>(bookingService.createBooking(booking), HttpStatus.CREATED);
    }

}
