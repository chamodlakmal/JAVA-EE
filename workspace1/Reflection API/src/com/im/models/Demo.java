package com.im.models;

import com.im.reflection.Analyse;
import com.im.reflection.CC;

public class Demo {
	public static void main(String[] args) {
		Student obj=new Student();
		obj.setId(9);
		obj.setName("Chamod Lakmal");
		obj.setAddress("Nugegoda");
		obj.setMobile("0714954149");
		obj.setNic("971232862v");
		obj.setAge(21);
		
		
		
		Course c=new Course();
		c.setId(2);
		c.setName("IDEX - JAVA EE");
		c.setFee(38000.00);
		c.setDuration("6 months");
		c.setSyllabus("ABC");
		CC.save(c);
		
	}

}
