package com.im.supplier.bo;

import java.util.List;

import com.im.supplier.dao.SupplierDao;
import com.im.supplier.model.Supplier;

public class SupplierBoImpl implements SupplierBo {
	SupplierDao supplierDao;

	public SupplierDao getSupplierDao() {
		return supplierDao;
	}

	public void setSupplierDao(SupplierDao supplierDao) {
		this.supplierDao = supplierDao;
	}

	@Override
	public void addSupplier(Supplier supplier) {
		supplierDao.addSupplier(supplier);
		
	}

	@Override
	public List<Supplier> listSupplier() {
		return supplierDao.listSupplier();
	}
	

}
