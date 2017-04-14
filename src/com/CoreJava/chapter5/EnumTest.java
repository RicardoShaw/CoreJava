/**
 * 
 */
package com.CoreJava.chapter5;

import java.util.Scanner;

/** 
 * @author  ch7x1a0 作者 E-mail:ch7x1a0@gmail.com 
 * @date 创建时间：2016年6月12日 下午2:06:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class EnumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a size : (SMALL, MEDIUM, LARGE , EXTRA_LARGE) ");
		String input = in.next().toUpperCase();
		Size size = Enum.valueOf(Size.class, input);
		System.out.println("Size = " + size);
		System.out.println("abbreviation = "+ size.getAbbreviation());
		if( size == Size.EXTRA_LARGE ){
			System.out.println("Good job -- you paid attention to the _.");
		}
	}

}
