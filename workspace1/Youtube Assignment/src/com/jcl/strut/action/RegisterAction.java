package com.jcl.strut.action;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.jcl.strut.db.DB;
import com.jcl.strut.model.User;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport implements SessionAware{
	private User user; 
	public String registration() {
		try {
			DB.save(user);
			//Return Success
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			//Return ERROR
			return ERROR;
		}
	}
	@Override
	public void setSession(Map<String, Object> session) {
		
		
	}

}
