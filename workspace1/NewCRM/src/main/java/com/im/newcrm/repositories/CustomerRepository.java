package com.im.newcrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.im.newcrm.entities.Customer;



public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
