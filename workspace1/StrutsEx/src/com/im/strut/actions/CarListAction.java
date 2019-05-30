package com.im.strut.actions;

import java.util.ArrayList;
import java.util.List;

public class CarListAction {
	
	public List<String> list=new ArrayList<>();
	
	
	public String execute()
	{
		try {
			//should be collect from db
			list.add("Honda Car");
			list.add("Toyota Corolla Car");
			list.add("Honda CRV for Sale");
			list.add("Mitsubishi car for Sale");
			return "success";
		} catch (Exception e) {
			return "error";
		}
		
		
	}

}
