/**
 * 
 */
package com.CoreJava.chapter5;

import java.util.ArrayList;

/** 
 * @author  ch7x1a0 作者 E-mail:ch7x1a0@gmail.com 
 * @date 创建时间：2016年6月11日 下午6:47:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class ArrayListTest {
	public static void main(String[] args){
		ArrayList<Employee> staff = new ArrayList<>();
		staff.add(new Employee("Carl Cracker",75000,1987,12,15));
		staff.add(new Employee("Harry Hacker",50000,1989,10,1));
		staff.add(new Employee("Tony Tester",40000,1989,3,15));
		
		for(Employee e : staff){
			e.raiseSalary(5);
		}
		for(Employee e : staff){
			System.out.println( "name = "+e.getName()+",salary = "+e.getSalary()+",hireday = "+e.getHireday());
		}
	}
}
