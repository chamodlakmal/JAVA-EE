package com.im.carsale.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	int id;
	String title;
	int milage;
	int year;
	double price;
	char condition;
	String description;
	String photo;
	int sold;
	@Column (name="view_count")
	int viewCount;
	@Column (name="imp_count")
	int impCount;
	@Column (name="model_id")
	int modelId;
	@Column (name="fuel_type_id")
	int fuelTypeId;
	@Column (name="user_id")
	int userId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public char getCondition() {
		return condition;
	}
	public void setCondition(char condition) {
		this.condition = condition;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getImpCount() {
		return impCount;
	}
	public void setImpCount(int impCount) {
		this.impCount = impCount;
	}
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public int getFuelTypeId() {
		return fuelTypeId;
	}
	public void setFuelTypeId(int fuelTypeId) {
		this.fuelTypeId = fuelTypeId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
