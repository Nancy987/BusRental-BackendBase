package com.rental.busRental.services;

import com.rental.busRental.models.Booking;
import com.rental.busRental.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository){
        this.bookingRepository=bookingRepository;
    }

    public Booking createBooking(Booking booking) {
        Booking newBooking = bookingRepository.save(booking);
        return newBooking;

    }
}
