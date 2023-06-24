package com.logic;

public class CountOfDigits {
	
	public static void main(String[] args) {
		
		int num=2345643, Count=0;
		
		while (num>0) {
			
			Count++;
			num=num/10;
			
		}
		
		System.out.println(Count);
	}

}
