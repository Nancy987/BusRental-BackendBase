package com.rental.busRental.services;

import com.rental.busRental.models.Booking;
import com.rental.busRental.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking getBookingBy(Long bookingId) {
        return bookingRepository.findById(bookingId).orElseThrow();
    }
}
