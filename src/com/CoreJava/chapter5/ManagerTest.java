/**
 * 
 */
package com.CoreJava.chapter5;

import com.CoreJava.Base.Employee;
import com.CoreJava.Base.Manager;

/** 
 * @author  {user} 作者 E-mail:ch7x1a0@gmail.com 
 * @date 创建时间：2016年6月10日 下午10:57:31 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class ManagerTest {
	public static void main(String[] args){
		Manager boss = new Manager("Carl Cracker",80000,1987,12,15);
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[3];
		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
		staff[2] = new Employee("Tommy Tester",40000,1990,3,15);
		
		for(Employee e : staff){
			System.out.println(e.getName()+"|"+e.getSalary());
		}
	}
}
