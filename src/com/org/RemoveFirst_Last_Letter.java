package com.org;

public class RemoveFirst_Last_Letter {
	
	
	
	public static void main(String[] args) {
		
		String input = "madam";
		
		if (input.length()>=2) {
			
			String substring = input.substring(1, input.length()-1);
			
			System.out.println(substring);
			
		} else {
			
			System.out.println("the is too Short");

		}
	}
	
	
	
//	public void removeName(String name) {
//		
//		if (name.length()>=2) {
//			
//			String earseName = name.substring(1, name.length()-1);
//			
//			System.out.println(earseName);
//			
//		} else {
//			
//			System.out.println("String is too short");
//			
//
//		}
//	}
//		
//
//	public static void main(String[] args) {
//		
//		RemoveFirst_Last_Letter removeFirst_Last_Letter = new RemoveFirst_Last_Letter();
//		
//		String name= "Hello";
//		
//		removeFirst_Last_Letter.removeName(name);
//		
//		
//	}
	
	}