package com.im.customer.bo;

import java.util.List;

import com.im.customer.dao.CustomerDao;
import com.im.customer.model.Customer;

public class CustomerBoImpl implements CustomerBo {
	CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		
		this.customerDao = customerDao;
	}

	//call Dao to save customer
	public void addCustomer(Customer customer){
		//Buisness logic here
		customerDao.addCustomer(customer);
	}
	
	//call Dao to return customers
	public List<Customer> listCustomer(){
		return customerDao.listCustomer();
	}

	

}
