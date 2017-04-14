/**
 * 
 */
package com.CoreJava.equals;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/** 
 * @author  ch7x1a0 作者 E-mail:ch7x1a0@gmail.com 
 * @date 创建时间：2016年6月11日 下午4:56:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Employee {
	private String name;
	private double salary;
	private Date hireday;
	
	public Employee(String name , double salary , int year ,int month ,int day){
		this.name = name ; 
		this.salary = salary ;
		GregorianCalendar calendar = new GregorianCalendar(year , month-1 , day);
		this.hireday = calendar.getTime();
	}

	public String getName() {
		return name;
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

	@Override
	public int hashCode() {
		return Objects.hash(name,salary,hireday);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Employee other = (Employee) obj;
		
		return Objects.equals(name, other.name) && salary == other.salary
				&& Objects.equals(hireday, other.hireday);
	}
	
	public String toString(){
		return getClass().getName()+"[name="+name+",salary="+salary+",hireday="+hireday+"]";
	}
}
