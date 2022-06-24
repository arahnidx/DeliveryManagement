package model;

import java.util.ArrayList;
import java.util.Date;

public class Person {
	protected String name, email, sex, photo, address;
	protected Date birthdate;
	protected ArrayList<String> phone = new ArrayList<String>();
	
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public ArrayList<String> getPhone() {
		return phone;
	}
	public void setPhone(ArrayList<String> phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [address=" + address + ", birthdate=" + birthdate + ", email=" + email + ", name=" + name
				+ ", phone=" + phone + ", photo=" + photo + ", sex=" + sex + "]";
	}

	
	
	
	



}
