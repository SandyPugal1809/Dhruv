package com.logic;

public class CountNumber {
	
	public static void main(String[] args) {
		
		int Count=0;
		
		for (int i = 1; i < 100; i++) {
			
			if (i%2==1) {
				
				Count++;
				
			}
			
		}
		
		System.out.println(Count);
	}

}
