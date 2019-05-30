package com.im.strut.actions;

public class RegisterAction {
	public String name,email,mobile,password;
	
	public String execute()
	{
		try {
			System.out.println("Registering User "+name+email+mobile+password);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		
	}

}
