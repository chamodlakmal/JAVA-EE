package com.jcl.models;

import com.jcl.reflection.CC;

public class Demo {
	
	public static void main(String[] args) {
		Student obj=new Student();
		obj.setId(12);
		obj.setName("Chamod Lakmal");
		obj.setAddress("Nugegoda");
		obj.setMobile("0714954149");
		obj.setNic("971232862v");
		obj.setAge(21);
		//CC.save(obj);
		//CC.selectAll(obj);
		//CC.selectId(obj, 12);
		
		//CC.deleteById(obj, 11);
		
		Course c=new Course();
		
		CC.create_table(c);
	}
	

}
