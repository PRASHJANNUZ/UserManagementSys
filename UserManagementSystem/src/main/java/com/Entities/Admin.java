package com.Entities;

import java.util.Random;

import javax.persistence.*;

@Entity
@Table(name="Admin")
public class Admin {

	@Id
	private int id;
	private String name;
	private String password;
	private String email;
	private String type;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Admin(String name, String password, String email, String type) {
		super();
		this.id = new Random().nextInt(100000);
		this.name = name;
		this.password = password;
		this.email = email;
		this.type= type;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}
