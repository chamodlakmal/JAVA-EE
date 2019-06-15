package com.im.supplier.bo;

import java.util.List;

import com.im.supplier.model.Supplier;

public interface SupplierBo {
	void addSupplier(Supplier supplier);
	List<Supplier> listSupplier();

}
