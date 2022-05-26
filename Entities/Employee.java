package Entities;


import java.util.Date;


public class Employee extends Person {
	String Job;
	int Shift;
	float Salary;
	Date Hiredate;
	
	
	public Employee() {
		
		this.Hiredate = new Date();
	}
	

}
