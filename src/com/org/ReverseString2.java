package com.org;

public class ReverseString2 {
	
	public static void main(String[] args) {
		
		String s="madam";
		 
		String reversestr="";
		
		int length = s.length();
		System.out.println(length);
		
		for  (int i = s.length()-1; i >=0; i--) {
			
			reversestr=reversestr + s.charAt(i);
			System.out.println(reversestr);
				
			
		}
		
		if (reversestr.equals(s)) {
			
			System.out.println("the reverse String is present");
			
		} else {

			System.out.println("the reverse String is not present");

		}
		
		
	
	

	}
	

}

