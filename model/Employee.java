package model;


import java.util.ArrayList;
import java.util.Date;


public class Employee extends Person {
	private String Job;
	private int Shift;
	private float Salary;
	private Date Hiredate;
	
	
	public Employee(String Name, String Email, String Sex, String Address, Date Birthdate, String Photo, ArrayList<String> Phone) {
		this.Name = Name;
		this.Email = Email;
		this.Sex = Sex;
		this.Birthdate = Birthdate;
		this.Address = Address;
		this.Photo = Photo;
		this.Hiredate = new Date();
		for (String i : Phone){
			this.Phone.add(i);
		}
	}


	public String getJob() {
		return Job;
	}


	public void setJob(String job) {
		Job = job;
	}


	public int getShift() {
		return Shift;
	}


	public void setShift(int shift) {
		Shift = shift;
	}


	public float getSalary() {
		return Salary;
	}


	public void setSalary(float salary) {
		Salary = salary;
	}


	public Date getHiredate() {
		return Hiredate;
	}


	public void setHiredate(Date hiredate) {
		Hiredate = hiredate;
	}


	@Override
	public String toString() {
		return "Employee [Hiredate=" + Hiredate + ", Job=" + Job + ", Salary=" + Salary + ", Shift=" + Shift + "]";
	}



	
	
	

}
