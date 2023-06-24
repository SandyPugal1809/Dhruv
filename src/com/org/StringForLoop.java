package com.org;

public class StringForLoop {
	
	private void stringParameter() {
		
		//Syntax error after this token {} insert this
		
		String [] cars = {"Voleo","BMW","AUDI","ROLLS ROYCE"};
				
				for (String string : cars) {
					
					int indexOf = string.indexOf('e');
					
					System.out.println(indexOf);
					
					
				}

	}
	
	public static void main(String[] args) {
		
		StringForLoop stringForLoop =new StringForLoop();
		
		stringForLoop.stringParameter();
		
		
		
	}

}
