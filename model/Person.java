package model;

import java.util.ArrayList;
import java.util.Date;

public class Person {
	protected String name, email, sex, photo, address;
	protected Date birthdate;
	protected ArrayList<String> phone = new ArrayList<String>();

	//Employees
	protected String job;
	protected Integer shift;
	protected double salary;
	protected Date hireDate;
	//Customer
	protected double credit;



}
