package com.CoreJava.Base;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	private static int nextId = 1;
	private int id;
	private String name;
	private double salary;
	private Date hireday;
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public Date getHireday() {
		return (Date) hireday.clone();
	}
	public Employee(String name, double salary , int year ,int month , int day){
		this.name = name;
		this.salary = salary;
		GregorianCalendar  calendar = new GregorianCalendar();
		calendar.set(year, month-1, day);
		this.hireday=calendar.getTime();
	}
	public void raiseSalary(double bypercent){
		double raise = salary * bypercent / 100 ;
		salary += raise;
	}
	public boolean equals(Employee other){
		return name.equals(other.name);
	}
	public void setId()
	{
		id = nextId;
		nextId++;
	}
	public int getId() {
		return id;
	}
	
}
