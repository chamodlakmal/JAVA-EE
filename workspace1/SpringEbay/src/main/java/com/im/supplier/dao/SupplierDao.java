package com.im.supplier.dao;

import java.util.List;

import com.im.supplier.model.Supplier;



public interface SupplierDao {
	void addSupplier(Supplier supplier);
	List<Supplier> listSupplier();

}
