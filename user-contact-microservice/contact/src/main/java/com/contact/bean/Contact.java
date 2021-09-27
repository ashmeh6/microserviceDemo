package com.contact.bean;

public class Contact {

	long id;
	String email;
	String phone;
	long userId;
	
	public Contact(long id, String email, String phone, long userId) {
		super();
		this.id = id;
		this.email = email;
		this.phone = phone;
		this.userId = userId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}	
}
