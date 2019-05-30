package com.im.hibernate.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
public class Student {
	@GeneratedValue
	@Id
	int id;
	@Basic(optional=false)
	String name;
	String nic;
	String adress;
	String telephone;
	String dateOfBirth;
	String joinDate;
	@Transient
	int count;
	Date date1;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Date getDate1() {
		return date1;
	}
	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	String motherName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public void setDateOfBirth(String string) {
		this.dateOfBirth = string;
	}
	
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	@Temporal(TemporalType.DATE)
	Date bdate;
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	
	
	
	
	
	
	

}
