/**
 * 
 */
package com.CoreJava.chapter5;

import java.util.Date;
import java.util.GregorianCalendar;

/** 
 * @author  ch7x1a0 作者 E-mail:ch7x1a0@gmail.com 
 * @date 创建时间：2016年6月11日 下午3:59:35 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Employee extends Person {
	private double salary;
	private Date hireday;
	
	public Employee(String name , double salary , int year , int month , int day){
		super(name);
		this.salary = salary;
		GregorianCalendar calendar = new GregorianCalendar(year,month,day);
		hireday = calendar.getTime();
	}
	
	
	/**
	 * @param name
	 */
	public Employee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.CoreJava.chapter5.Person#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return String.format("an employee with a salary of $%.2f", salary);
	}


	public double getSalary() {
		return salary;
	}


	public Date getHireday() {
		return hireday;
	}
	
	public void raiseSalary(double byPercent){
		double raise = salary * byPercent / 100 ;
		salary += raise;
	}
}
