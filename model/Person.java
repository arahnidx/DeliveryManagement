package model;

import java.util.ArrayList;
import java.util.Date;

public class Person {
	private String Name, Email, Sex, Photo, Address;
	private Date Birthdate;
	private ArrayList<String> Phone = new ArrayList<String>();
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getPhoto() {
		return Photo;
	}
	public void setPhoto(String photo) {
		Photo = photo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Date getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(Date birthdate) {
		Birthdate = birthdate;
	}
	public ArrayList<String> getPhone() {
		return Phone;
	}
	public void setPhone(ArrayList<String> phone) {
		Phone = phone;
	}

	
	
	
	



}
