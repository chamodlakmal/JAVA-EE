package com.im.myebay.action;

import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.im.myebay.model.Member;
import com.im.myebay.util.DB;
import com.opensymphony.xwork2.ActionSupport;

public class MemberAction extends ActionSupport implements SessionAware{
	
	private Member member; 
	//Form Field Values will be assigned automatically via Value Stack
	
	Map<String, Object> map;
	

	public String registration() {
		try {
			DB.save(member);
			//Return Success
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			//Return ERROR
			return ERROR;
		}
	}
	
	public String auth() {
		try {
			SessionFactory sf = DB.getSessionFactory();
			Session session = sf.openSession();
			String hql = "from Member where email=:p1 AND password=:p2";
			Query query = session.createQuery(hql);
			query.setParameter("p1", member.getEmail());
			query.setParameter("p2", member.getPassword());
			
			List result = query.getResultList();
			if(result.size()>0) {
				Member member = (Member)result.get(0);
				map.put("NAME", member.getName());
				
				return SUCCESS;
			}else {
				return ERROR;
			}
			//Return Success
			
		} catch (Exception e) {
			e.printStackTrace();
			//Return ERROR
			return ERROR;
		}
	}


	public Member getMember() {
		return member;
	}


	public void setMember(Member member) {
		this.member = member;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.map = session;
	}
}
