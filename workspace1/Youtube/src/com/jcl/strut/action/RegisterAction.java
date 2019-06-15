package com.jcl.strut.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jcl.strut.db.DB;
import com.jcl.strut.model.User;
import com.jcl.strut.model.Video;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	 private User user;
	 
	 Map<String, Object> map;
	
	public String registration() {
		
		try {
			DB.save(user);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		
	}
	private List<Video> itemList;
	private Video item;
	public String auth() {
		try {
			SessionFactory sf = DB.getSessionFactory();
			Session session = sf.openSession();
			String hql = "from User where email=:p1 AND password=:p2";
			Query query = session.createQuery(hql);
			query.setParameter("p1", user.getEmail());
			query.setParameter("p2", user.getPassword());
			
			List result = query.getResultList();
			if(result.size()>0) {
				User user = (User)result.get(0);
				//map.put("NAME", user.getFirstName());
				itemList =  (List<Video>) DB.list("Video");
				return SUCCESS;
			}else {
				return ERROR;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public List<Video> getItemList() {
		return itemList;
	}
	public void setItemList(List<Video> itemList) {
		this.itemList = itemList;
	}
	public Video getItem() {
		return item;
	}
	public void setItem(Video item) {
		this.item = item;
	}
	
	
	
}
