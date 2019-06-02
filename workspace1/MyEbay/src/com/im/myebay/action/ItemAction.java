package com.im.myebay.action;

import java.io.File;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.im.myebay.model.Item;
import com.im.myebay.util.DB;
import com.opensymphony.xwork2.ActionSupport;

public class ItemAction  extends ActionSupport{

	private List<Item> itemList;
	private Item item;
	
	public String list() {
		itemList =  (List<Item>) DB.list("Item");
		return SUCCESS;
	}
	
	public String add(){
		
		try {
			ServletContext servletContext = ServletActionContext.getServletContext();
			String path = "/uploads/";
			String filePath = servletContext.getRealPath(path);
			System.out.println("Server path:" + filePath);
		    File fileToCreate = new File(filePath, item.getPhotoFileName());
		    FileUtils.copyFile(item.getPhoto(), fileToCreate);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		DB.save(item);
		itemList =  (List<Item>) DB.list("Item");
		return SUCCESS;
	}

	
	
	
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	
	
	
}
