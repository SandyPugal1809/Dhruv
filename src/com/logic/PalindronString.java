package com.logic;

public class PalindronString {
	
	public static void main(String[] args) {
		
		String name= "madam";
		
		String res="";
		
		for (int i =name.length()-1; i >=0; i--) {
			
			char c = name.charAt(i);
			
			res=res+c;

			}
		System.out.println(res);
		
		
		if (res.equals(name)) {
			
			System.out.println("Palindrom String");
			
		} else {
			
			System.out.println("Not Palindrom String");
			
		}
		
	}

}
