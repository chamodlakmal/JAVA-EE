package com.jcl.strut.action;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jcl.strut.model.User;
import com.mysql.fabric.xmlrpc.base.Data;

public class RegisterAction {
	public String firstName,lastName,email,password,confirmPassword,phone,day,month,year,gender;
	public String bod=year+"/"+month+"/"+day;
	public String execute()
	{
		try {
			User user=new User();
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setEmail(email);
			user.setPassword(password);
			user.setPhone(phone);
			Date date=new Date();
			user.setRegDate(date);
			user.setGender(gender);
			user.setStatus(1);
			user.setBod(bod);
			Configuration config=new Configuration();
			SessionFactory sf=config.configure().buildSessionFactory();
			Session session=sf.openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();			
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		
	}

}
