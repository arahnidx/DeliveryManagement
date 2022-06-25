package model;


import java.util.ArrayList;
import java.util.Date;


public class Employee extends Person {
	protected String job;
	protected Integer shift;
	protected double salary;
	protected Date hireDate;

	public Employee() {
	}
	public Employee(String name, String email, String sex, String address, Date birthdate, String photo, ArrayList<String> phone) {
		this.name = name;
		this.email = email;
		this.sex = sex;
		this.birthdate = birthdate;
		this.address = address;
		this.photo = photo;
		this.hireDate = new Date();
		for (String i : phone){
			this.phone.add(i);
		}
	}



}
