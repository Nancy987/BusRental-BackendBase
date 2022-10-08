package com.rental.busRental.services;

import com.rental.busRental.models.Bus;
import com.rental.busRental.repositories.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusService {
    private BusRepository busRepository;

    @Autowired
    public BusService(BusRepository busRepository){
        this.busRepository = busRepository;
    }

    public Bus createBus(Bus bus) {
        return busRepository.save(bus);
    }

    public List<Bus> getAllBus() {
        return busRepository.findAll();
    }

    public Optional<Bus> getBusById(Long busId) {
        return busRepository.findById(busId);
    }

    public void deleteBus(Long busId) {
        busRepository.deleteById(busId);
    }

}
