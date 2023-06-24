package com.logic;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		long num=6792343568L,res=0,rem=0;
		
		while (num>0) {
			
			rem=num%10;//123%10=12.3//12%10=1.2//1%10=0.1
			res=res*10+rem; //0*10=0+3=3//3*10+2=32//32*10+1=321
			num=num/10; //123/10=12//12/10=1//
			
			
		}
				
				
		
	
		
		System.out.println(res);
		
		
	}

}
