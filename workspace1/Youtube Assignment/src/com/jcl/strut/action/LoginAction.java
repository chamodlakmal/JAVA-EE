package com.jcl.strut.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jcl.strut.model.User;

public class LoginAction {
	public String email,phone;
	public String execute()
	{
		try {
			Configuration config = new Configuration();
			SessionFactory sf = config.configure().buildSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			User user = (User)session.get(User.class,email);
			//System.out.println(user.getPassword());
			System.out.println(email);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		
	}

}
