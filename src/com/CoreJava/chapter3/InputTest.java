package com.CoreJava.chapter3;

import java.util.Scanner;

public class InputTest {
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = in.nextLine();
		
		System.out.println("How old are you?");
		int age = in.nextInt();
		
		System.out.println("name:"+name+"\n"+"age:"+age);
		System.out.printf("your name: %s,your age:%d", name,age);
		
	}
}
