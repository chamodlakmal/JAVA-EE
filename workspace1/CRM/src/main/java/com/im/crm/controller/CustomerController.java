package com.im.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.im.crm.entities.Customer;
import com.im.crm.repositories.CustomerRepository;

@RestController
@CrossOrigin(origins="http://localhost:8080")
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;
	
	
	@RequestMapping("/")
	public String index()
	{
		return "Greetings from Spring Boot!";
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomers()
	{
		return customerRepository.findAll();
	}
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable Long id)
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
