package com.im.supplier.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.aop.ThrowsAdvice;

import com.im.supplier.bo.SupplierBo;
import com.im.supplier.model.Supplier;
import com.opensymphony.xwork2.ModelDriven;

public class SupplierAction implements ModelDriven {
	
	Supplier supplier=new Supplier();
	List<Supplier> supplierList=new ArrayList<Supplier>();
	SupplierBo supplierBo;
	

	public Supplier getSupplier() {
		return supplier;
	}


	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}


	public List<Supplier> getSupplierList() {
		return supplierList;
	}


	public void setSupplierList(List<Supplier> supplierList) {
		this.supplierList = supplierList;
	}


	public SupplierBo getSupplierBo() {
		return supplierBo;
	}


	public void setSupplierBo(SupplierBo supplierBo) {
		this.supplierBo = supplierBo;
	}


	@Override
	public Object getModel() {
		return null;
	}
	
	public String addSupplier() throws Exception
	{
		supplier.setCreatedDate(new Date());	
		supplierBo.addSupplier(supplier);
		supplierList=supplierBo.listSupplier();
		
		return "success";
		
		
	}
	
	public String listSupplier() throws Exception
	{
		supplierList=supplierBo.listSupplier();
		return "success";
	}
	

}
