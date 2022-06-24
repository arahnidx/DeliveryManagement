package model;


import java.util.ArrayList;
import java.util.Date;


public class Employee extends Person {
	private String job;
	private int shift;
	private double salary;
	private Date hireDate;
	
	
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


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public int getShift() {
		return shift;
	}


	public void setShift(int shift) {
		this.shift = shift;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public Date getHireDate() {
		return hireDate;
	}


	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}


	@Override
	public String toString() {
		return "Employee [hireDate=" + hireDate + ", job=" + job + ", Salary=" + salary + ", shift=" + shift + "]";
	}



	
	
	

}
