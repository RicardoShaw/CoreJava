/**
 * 
 */
package com.CoreJava.equals;

/** 
 * @author  ch7x1a0 作者 E-mail:ch7x1a0@gmail.com 
 * @date 创建时间：2016年6月11日 下午5:27:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class EqualsTest {
	public static void main(String [] args){
		Employee alice1 = new Employee("Alice Adams",75000,1987,12,15);
		Employee alice2 = alice1;
		Employee alice3 = new Employee("Alice Adams",75000,1987,12,15);
		Employee bob = new Employee("Bob Brandson",50000,1989,10,1);
		System.out.println("alice1 == alice2 :"+(alice1 == alice2));
		System.out.println("alice1 == alice3 :"+(alice1 == alice3));
		System.out.println("alice1.equals(alice3) :"+alice1.equals(alice3));
		System.out.println("alice1.equals(bob) :"+alice1.equals(bob));
		System.out.println("bob.toString() : "+bob.toString());
		
		
		Manager carl = new Manager("Carl Cracker",800000,1987,12,15);
		Manager boss = new Manager("Carl Cracker",800000,1987,12,15);
		boss.setBonus(5000);
		System.out.println("boss.toString() : "+boss.toString());
		System.out.println("Carl.equals(boss) :"+carl.equals(boss));
		System.out.println("alice1.hashCode() :"+alice1.hashCode());
		System.out.println("alice3.hashCOde() :"+alice3.hashCode());
		System.out.println("bob.hashCode() :"+bob.hashCode());
		System.out.println("carl.hashCode() :"+carl.hashCode());
	}
}
