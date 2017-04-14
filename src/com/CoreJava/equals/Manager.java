/**
 * 
 */
package com.CoreJava.equals;

/** 
 * @author  ch7x1a0 作者 E-mail:ch7x1a0@gmail.com 
 * @date 创建时间：2016年6月11日 下午5:19:25 
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
		bonus = 0;
	}
	public double getSalary(){
		double baseSalary = super.getSalary();
		return bonus+baseSalary;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getBonus() {
		return bonus;
	}
	public boolean equals(Object otherObject){
		if( !super.equals(otherObject)) return false;
		Manager other = (Manager) otherObject;
		return bonus == other.bonus;
	}
	public int hashCode(){
		return super.hashCode() + 17 * new Double(bonus).hashCode();
	}
	public String toString(){
		return super.toString() + "[bonus=" + bonus +"]";
	}
}
