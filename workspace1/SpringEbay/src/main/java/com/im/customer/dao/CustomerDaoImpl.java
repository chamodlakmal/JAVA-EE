package com.im.customer.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.im.customer.model.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public void addCustomer(Customer customer) {
		getHibernateTemplate().save(customer);
		
	}

	@Override
	public List<Customer> listCustomer() {
		
		return getHibernateTemplate().find("from Customer");
	}

}
