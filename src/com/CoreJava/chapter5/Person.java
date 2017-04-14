/**
 * 
 */
package com.CoreJava.chapter5;

/** 
 * @author  ch7x1a0 作者 E-mail:ch7x1a0@gmail.com 
 * @date 创建时间：2016年6月11日 下午3:46:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public abstract class Person {
	protected String name;
	public Person(String name){
		this.name = name;
	}
	public abstract String getDescription();
	public String getName() {
		return name;
	}
	
}
