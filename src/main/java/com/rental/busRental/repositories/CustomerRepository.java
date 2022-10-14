package com.rental.busRental.repositories;

import com.rental.busRental.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    @Query("select u FROM Customer u WHERE u.emailId =:email and u.password =:pass")
    public Customer findByEmailPassword(@Param("email") String emailId,@Param("pass") String password);
}
