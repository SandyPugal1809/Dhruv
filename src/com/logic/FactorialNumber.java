package com.logic;

public class FactorialNumber {
	
	public static void main(String[] args) {
		
		
		int num=5,fact=1;
		
		for (int i = 5; i > 0; i--) {
			
			fact=fact*i;
			
		}
		
		System.out.println(fact);
		System.out.println(num);
	}

}
