package com.Entities;

import java.util.Date; 
import java.util.Random;

import javax.persistence.*;


@Entity
@Table(name="Users")
public class User {

	@Id
	private int id;
	private String name;
	private String email;
	private String phone;
	private String city;
	private String gender;
	private Date addedDate;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public User(String name, String email, String phone, String city, String gender, Date addedDate) {
		super();
		this.id = new Random().nextInt(100000);
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.gender=gender;
		this.addedDate = addedDate;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
