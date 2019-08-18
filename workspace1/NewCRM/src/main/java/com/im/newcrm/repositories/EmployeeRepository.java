package com.im.newcrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.im.newcrm.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
