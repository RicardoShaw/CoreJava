package com.CoreJava.chapter4;

import java.util.Date;
import java.util.GregorianCalendar;

public class StaticTest {

	public static void main(String[] args) {
			Employee[] staff = new Employee[3];
			staff[0] = new Employee("dutao",100000);
			staff[1] = new Employee("xiaochi",10000000);
			staff[2] = new Employee("X",1000);
			
			
			for(Employee e : staff ){
				e.setId();
				System.out.println(e.getId()+"|"+e.getName()+"|"+e.getSalary());
			}
			
			int n = Employee.getNextId();
			System.out.println("next id : "+n);

	}

}
class Employee{
	private static int nextId = 1;
	private int id;
	private String name;
	private double salary;
	private Date hireday;
	public static int getNextId() {
		return nextId;
	}
	public static void setNextId(int nextId) {
		Employee.nextId = nextId;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = nextId;
		nextId++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void raiseSalary(double bypercent){
		double raise = salary * bypercent /100 ;
		salary += raise;
	}
	public Date getHireday() {
		return (Date) hireday.clone();
	}
	public void setHireday(Date hireday) {
		this.hireday = hireday;
	}
	public Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
		id = 0;
	}
	public Employee(){}
	public Employee(String name , double salary , int year ,int month , int day){
		this.name = name;
		this.salary = salary;
		GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
		this.hireday = calendar.getTime();
	}
	public static void main(String[] args){
		Employee e = new Employee("dutao",1000000);
		System.out.println(e.getName()+"|"+e.getSalary());
	}
}