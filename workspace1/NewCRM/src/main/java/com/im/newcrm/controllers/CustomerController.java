package com.im.newcrm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.im.newcrm.entities.Customer;


@RestController
@CrossOrigin(origins="*",allowedHeaders="*",maxAge=3600)
public class CustomerController {
	@Autowired
	private com.im.newcrm.repositories.CustomerRepository customerRepository;
	
	
	@RequestMapping("/")
	public String index()
	{
		return "Greetings from Spring Boot!";
	}
	
	@GetMapping("/customers")
	public List<com.im.newcrm.entities.Customer> getCustomers()
	{
		return customerRepository.findAll();
	}
	@GetMapping("/customer/{id}")
	public com.im.newcrm.entities.Customer getCustomer(@PathVariable Long id)
	{
		return customerRepository.findById(id).get();
	}
	@DeleteMapping("/customer/{id}")
	public boolean deleteCustomer(@PathVariable Long id)
	{
		customerRepository.deleteById(id);
		return true;
	}
	@PostMapping("/customer")
	public Customer createCustomer(Customer customer)
	{
		return customerRepository.save(customer);
	}
}
