package com.im.crm.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Customer {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String Address;
	private String mobile;
	
	public Customer()
	{
		
	}
	
	public Customer(String name,String Address,String mobile)
	{
		this.name=name;
		this.mobile=mobile;
		this.Address=Address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		
		return name;
	}

}
