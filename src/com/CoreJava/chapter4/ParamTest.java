package com.CoreJava.chapter4;

public class ParamTest {
	public static void main(String[] args){
	/*
	 * Test1 : Methods can't modify numeric  parameters
	 */
		System.out.println("Testing tripleValue");
		double percent = 10;
		System.out.println("Before: percent" + percent);
		tripleValue(percent);
		System.out.println("After : percent "+ percent);
		
		/*
		 * Test 2 : Method can change the state of object parameters
		 */
		System.out.println("\n Testing tripleSalary: ");
		Employee harry = new Employee("Harry",5000);
		System.out.println("Befor : salary "+ harry.getSalary());
		tripleSalary(harry);
		System.out.println("After : salary " + harry.getSalary());
		
		/*
		 * Test 3: Methods can't attach new objects to object parameters
		 */
		System.out.println("\n Testing swap: ");
		Employee a = new Employee("a",10000);
		Employee b = new Employee("b",90000);
		System.out.println("Before a : "+a.getName() + " | " +a.getSalary());
		System.out.println("Before b : " + b.getName() + " | " +b.getSalary());
		swap(a,b);
		System.out.println("After a : "+a.getName() + " | " +a.getSalary());
		System.out.println("After b : " + b.getName() + " | " +b.getSalary());
		
	}

	private static void swap(Employee a, Employee b) {
		Employee temp = a ;
		a = b;
		b = temp ;
		
		a.raiseSalary(100);
		b.raiseSalary(200);
		System.out.println("End of Method a:"+a.getName()+ " | " +a.getSalary());
		System.out.println("End of Method b:"+b.getName()+ " | " +b.getSalary());
		
	}

	private static void tripleSalary(Employee harry) {
		harry.raiseSalary(200);
		System.out.println("End of Method : salary= "+harry.getSalary());
	}

	private static void tripleValue(double x) {
		x = 3 * x;
		System.out.println("End of method: x= "+x);
	}
}
