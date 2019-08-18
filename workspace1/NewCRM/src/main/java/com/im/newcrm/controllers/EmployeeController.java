package com.im.newcrm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import com.im.newcrm.entities.Employee;



@RestController
@CrossOrigin(origins="*",allowedHeaders="*",maxAge=3600)
public class EmployeeController {
	@Autowired
	private com.im.newcrm.repositories.EmployeeRepository employeeRepository;
	
	
	
	
	@GetMapping("/employees")
	public List<com.im.newcrm.entities.Employee> getCustomers()
	{
		return employeeRepository.findAll();
	}
	@GetMapping("/employee/{id}")
	public com.im.newcrm.entities.Employee getCustomer(@PathVariable Long id)
	{
		return employeeRepository.findById(id).get();
	}
	@DeleteMapping("/employee/{id}")
	public boolean deleteEmployee(@PathVariable Long id)
	{
		employeeRepository.deleteById(id);
		return true;
	}
	@PostMapping("/employee")
	public Employee createEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}

}
