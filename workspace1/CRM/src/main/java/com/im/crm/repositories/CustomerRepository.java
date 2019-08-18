package com.im.crm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.im.crm.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
