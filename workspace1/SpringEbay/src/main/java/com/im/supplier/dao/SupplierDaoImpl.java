package com.im.supplier.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.im.supplier.model.Supplier;

public class SupplierDaoImpl extends HibernateDaoSupport implements SupplierDao {


	@Override
	public void addSupplier(Supplier supplier) {
		getHibernateTemplate().save(supplier);
		
	}

	@Override
	public List<Supplier> listSupplier() {
		
	 return getHibernateTemplate().find("from Supplier");
	}

}
