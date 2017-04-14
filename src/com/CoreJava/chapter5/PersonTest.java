/**
 * 
 */
package com.CoreJava.chapter5;

/** 
 * @author  ch7x1a0 作者 E-mail:ch7x1a0@gmail.com 
 * @date 创建时间：2016年6月11日 下午4:04:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class PersonTest {
	public static void main(String[] args){
		Person[] people = new Person[2];
		
		people[0] = new Employee("Xiaochi",100000,1992,07,15);
		people[1] = new Student("xiaochi","Sofeware Enginering");
		
		for(Person p : people){
			System.out.println(p.getDescription());
		}
		
	}
}
