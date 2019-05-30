package com.im.strut.actions;

import com.opensymphony.xwork2.ActionSupport;

//Value Stacks


public class LoginAction extends ActionSupport {
	public String email;
	public String password;
	
	@Override
	public void validate() {
		if(email.equals("")||!email.contains("@"))
		{
			addFieldError("email", "Email must be Valid");
		}
		if(password.equals(""))
		{
			addFieldError("password", "Password shold Enter ");
		}
	}
	public String auth() {
		
		if(email.equals("admin@example.com")&&password.equals("123"))
		{
			return SUCCESS;
		}else
		{
			return ERROR;
		}
		
	}

}
