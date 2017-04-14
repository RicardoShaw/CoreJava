/**
 * 
 */
package com.CoreJava.chapter5;

/** 
 * @author  ch7x1a0 作者 E-mail:ch7x1a0@gmail.com 
 * @date 创建时间：2016年6月11日 下午3:49:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Student extends Person {
	
	private String major;
	
	public Student(String name,String major){
		super(name);
		this.major = major;
	}
	
	/**
	 * @param name
	 */
	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.CoreJava.chapter5.Person#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.name+"majoring in "+this.major;
	}

}
