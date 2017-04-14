package com.CoreJava.chapter3;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args){
		int[] lucky ;
		int[] smallPrimes = new int[]{17,19,23,29,31,37};
		
		//这里比较重要，lucky与smallPrimes共用一个空间
		//所以任意改变lucky和smallPeimes中的数据
		//lucky与smallPrmes都会改变
		//		lucky = smallPrimes;
		
		
		//lucky通过Arrays.copyof复制smallPrimes数组
		//lucky与smallPrimes就变成了两个数组
		lucky = Arrays.copyOf(smallPrimes, smallPrimes.length);
		
		for(int i : lucky){
			System.out.print(i+" ");
		}
		for(int i : smallPrimes){
			System.out.print(i+" ");
		}
		
		lucky[5] = 12;
		
		for(int i : lucky){
			System.out.print(i+" ");
		}
		for(int i : smallPrimes){
			System.out.print(i+" ");
		}
		
		System.out.println(lucky.length);
	}
}
