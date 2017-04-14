package com.CoreJava.chapter4;


import com.CoreJava.Base.Employee;

public class EmployeeTest {
	public static void main(String [] args){
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("xiaochi",100000,1992,07,15);
		staff[1] = new Employee("liufen",100000,1991,11,27);
		staff[2] = new Employee("wuxia",100000,1992,02,10);
		
		for(Employee e: staff){
			e.raiseSalary(10);
		}
		for(Employee e : staff){
			System.out.println(e.getSalary()+"   "+e.getHireday());
		}
		String name = staff[0].getName();
		name = "HHH";
		System.out.println(staff[0].getName());
		
		
		staff[0].setId();
		staff[1].setId();
		staff[2].setId();
		System.out.println(staff[0].getId()+"|"+staff[1].getId()+"|"+staff[2].getId());
	}
}
