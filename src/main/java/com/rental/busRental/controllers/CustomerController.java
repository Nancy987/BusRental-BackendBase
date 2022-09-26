package com.rental.busRental.controllers;

import com.rental.busRental.models.Customer;
import com.rental.busRental.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Customer")
public class CustomerController {
     private CustomerService customerService;

     @Autowired
     public CustomerController(CustomerService customerService){
          this.customerService=customerService;
     }

     @GetMapping(value={"{custId}"})
     public ResponseEntity<Optional<Customer>> getOneCustomer(@PathVariable(required = false) Long custId){
          return ResponseEntity.status(HttpStatus.OK).body(customerService.viewCustomerBy(custId));
     }

     @GetMapping
     public ResponseEntity<Iterable<Customer>> getCustomer(){
          return ResponseEntity.status(HttpStatus.OK).body(customerService.viewAllCustomer());
     }

     @PostMapping
     public ResponseEntity<Nullable> addNewCustomer(@RequestBody Customer customer){
          customerService.createNewCustomer(customer);
          return ResponseEntity.status(HttpStatus.CREATED).body(null);
     }

}
