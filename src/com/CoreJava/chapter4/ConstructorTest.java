package com.CoreJava.chapter4;

import java.util.Random;

public class ConstructorTest {
	public static void main(String[] args){
		nEmployee[] staff = new nEmployee[3];
		staff[0] = new nEmployee("Harry",40000);
		staff[1] = new nEmployee(50000);
		staff[2] = new nEmployee();
		
		for(nEmployee e : staff){
			System.out.println(e.getId()+"|"+e.getName()+"|"+e.getSalary());
		}
	}
}
class nEmployee{
	private static int nextId;
	private int id ;
	private String name="";
	private double salary;
	
	static{
		Random generater = new Random();
		nextId = generater.nextInt(10000);
	}
	{
		id = nextId;
		nextId ++;
	}
	
	public nEmployee(String name,double salary){
		this.name = name;
		this.salary = salary;
	}
	public nEmployee(double salary){
		this("Employee #"+nextId,salary);
	}
	public nEmployee(){}
	public static int getNextId() {
		return nextId;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
}
