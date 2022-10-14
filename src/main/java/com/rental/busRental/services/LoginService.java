package com.rental.busRental.services;

import com.rental.busRental.models.Customer;
import com.rental.busRental.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private CustomerRepository customerRepository;

    @Autowired
    public LoginService(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }


    public String userLoginService(Customer customer){
        String msg = "";
        String email = customer.getEmailId();
        String password = customer.getPassword();
        if(customerRepository.findByEmailPassword(email,password)!=null){
            msg = "customer exists";
        }else{
            msg = "customer not exists";
        }
        return msg;
    }
}
