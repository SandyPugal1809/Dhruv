package com.logic;

public class SwappingNumberWo {
	
public static void main(String[] args) {
		
		int a=10,b=20;
		
		System.out.println("Before swapping a:"+a);
		System.out.println("Before swapping b:"+b);
	
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		
		System.out.println("After swapping a:"+a);
		System.out.println("After swapping b:"+b);
		
}	

}
