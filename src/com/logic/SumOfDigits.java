package com.logic;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		int num=23456,sum=0,rem=0;
		
		while (num>0) {
			
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		
		System.out.println(sum);
	}

}
