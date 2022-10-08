package com.rental.busRental.services;

import com.rental.busRental.models.Customer;
import com.rental.busRental.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }



    public Optional<Customer> viewCustomerBy(Long custId) {
        return customerRepository.findById(custId);

    }

    public Iterable<Customer> viewAllCustomer() {
        return customerRepository.findAll();
    }

    public void createNewCustomer(Customer customer) {
        customerRepository.save(customer);
    }


    public void removeCustomerBy(Long custId) {
        try{
            Customer customer = customerRepository.getReferenceById(custId);
            customerRepository.delete(customer);

        }
        catch(Exception e){
        }
    }

 
    public Customer updateCustomer(Customer customer, Long custId) {
        Customer existingCustomer = customerRepository.findById(custId).orElseThrow();

        existingCustomer.setCustomerName(customer.getCustomerName());

        return customerRepository.save(existingCustomer);

    }
}
