/**
 * 
 */
package com.CoreJava.chapter5;

/** 
 * @author  ch7x1a0 作者 E-mail:ch7x1a0@gmail.com 
 * @date 创建时间：2016年6月12日 下午2:12:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public enum Size {
	SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
	private Size(String abbreviation){this.abbreviation = abbreviation;}
	private String abbreviation;
	public String getAbbreviation() {
		return abbreviation;
	}
	
}
