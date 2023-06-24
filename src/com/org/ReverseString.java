package com.org;

public class ReverseString {
	
	public String reverseString() {
	
//	public static void main(String[] args) {
//		
//	
//		
//	String input = "madam";
//	
//	String reverseSt = "";
//	
//	
//	int length = input.length();
//	System.out.println(length);
//	
//	for (int i = input.length()-1;i >=0; i--) {
//		
//		reverseSt= reverseSt + input.charAt(i);
//		
//		System.out.println(reverseSt);
//		
//		
//}
//	
//	if (reverseSt.equals(input)) {
//		
//		System.out.println("the String is present");
//		
//
//		
//	} else {
//
//
//	
//	System.out.println("the string is not present");
//}
//	
//	}}		
		
		String input = "madam,";
				
				String[] split = input.split("");
				
				StringBuilder reversedString = new StringBuilder();
				
				for (int i = split.length -1;i>=0; i--) {
					
					reversedString.append(split[i]);
					
					if (i !=0) {
						
						reversedString.append("");
						
					}
					
				}
				return reversedString.toString();
	}
	
	public static void main(String[] args) {
		
		ReverseString reverseString = new ReverseString();
		
		String reverseString2 = reverseString.reverseString();
		
		System.out.println(reverseString2);
		
		
	}
}


	
//public String resveredString() {
//	
//	String input = "Hello, How \nare You?";
//		
//		String[] split = input.split(" ");
//		
//		StringBuilder reversedString = new StringBuilder();
//		
//		for (int i = split.length -1; i >=0; i--) {
//			
//			reversedString.append(split[i]);
//			
//			if (i !=0) {
//				
//		 reversedString.append(" ");
//					
//			}			
//			
//		}
//		
//		
//		return reversedString.toString();
//		
//		}
//
//
//
//			public static void main(String[] args) {
//				
//				ReverseString reverseString = new ReverseString();
//				
//				String resveredString = reverseString.resveredString();
//				
//				System.out.println(resveredString);
//				
//				
//			}
//
//		}
	


