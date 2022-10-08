package com.rental.busRental.controllers;

import com.rental.busRental.models.Bus;
import com.rental.busRental.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Bus")
public class BusController {
    private BusService busService;

    @Autowired
    public BusController(BusService busService){
        this.busService = busService;
    }

    @PostMapping
    public ResponseEntity<Bus> createBus(@RequestBody Bus bus){
        return new ResponseEntity<Bus>(busService.createBus(bus), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Bus> getBus(){
        return busService.getAllBus();
    }

    @GetMapping("{busId}")
    public ResponseEntity<Optional<Bus>> getOneBus(@PathVariable("busId") Long id) {
        return new ResponseEntity<Optional<Bus>>(busService.getBusById(id), HttpStatus.OK);
    }

    @DeleteMapping("{busId}")
    public ResponseEntity<String> deleteBus(@PathVariable("busId") Long id){
        busService.deleteBus(id);
        return new ResponseEntity<String>("Bus is deleted successfully.",HttpStatus.OK);
    }
}
