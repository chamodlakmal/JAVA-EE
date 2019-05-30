package com.im.myebay.action;

import java.util.List;

import com.im.myebay.model.Item;
import com.im.myebay.util.DB;
import com.opensymphony.xwork2.ActionSupport;


public class ItemAction extends ActionSupport{
	
	private List<Item> itemList;
	private Item item;
	
	public String list() {
		itemList=(List<Item>)DB.list("Item");
		return SUCCESS;
	}
	
	public String add() {
		DB.save(item);
		itemList=(List<Item>)DB.list("Item");
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
