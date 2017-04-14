/**
 * 
 */
package com.CoreJava.Base;

/** 
 * @author  ch7x1a0 作者 E-mail:ch7x1a0@gmail.com 
 * @date 创建时间：2016年6月10日 下午11:07:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Manager extends Employee {
	
	private double bonus;
	
	/**
	 * @param name
	 * @param salary
	 * @param year
	 * @param month
	 * @param day
	 */
	
	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		this.bonus = 0;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary+bonus;
	}
	
}
